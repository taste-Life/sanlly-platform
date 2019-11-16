package com.sanlly.production.utils;

import java.io.FileOutputStream;

import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfDocument;
import com.lowagie.text.pdf.PdfWriter;


public class ITextPdfUtil {
	
	public static void main(String[] args) {
		String content="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">    \r\n" + 
				"<html xmlns=\"http://www.w3.org/1999/xhtml\"> \r\n" + 
				"<head>\r\n" + 
				"  <meta charset=\"utf-8\"/>\r\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\"/>\r\n" + 
				"  <title>Pre Trip</title>\r\n" + 
				"  <style type=\"text/css\">\r\n" + 
				"  	@page{\r\n" + 
				"  	size: 210mm  297mm;　   \r\n" + 
				"  　　\r\n" + 
				"  	}\r\n" + 
				"    body {\r\n" + 
				"      color: #333;\r\n" + 
				"      font-size: 12px;\r\n" + 
				"      background: #fff;\r\n" + 
				"      line-height: 16px;\r\n" + 
				"      padding: 0;\r\n" + 
				"      margin: 0;\r\n" + 
				"      font-family: SimSun;\r\n" + 
				"    }\r\n" + 
				"    .clearfix {\r\n" + 
				"      zoom: 1;\r\n" + 
				"    }\r\n" + 
				"    .clearfix:after {\r\n" + 
				"      clear: both;\r\n" + 
				"      height: 0;\r\n" + 
				"      display: block;\r\n" + 
				"      visibility: hidden;\r\n" + 
				"      content: \".\";\r\n" + 
				"    }\r\n" + 
				"    .pre-main {\r\n" + 
				"      width: 680px;\r\n" + 
				"      height: 842px;\r\n" + 
				"      margin: 0 auto;\r\n" + 
				"      background: #fff;\r\n" + 
				"      position: relative;\r\n" + 
				"    }\r\n" + 
				"    .top{\r\n" + 
				"      padding: 5px 0;\r\n" + 
				"    }\r\n" + 
				"    .top-left {\r\n" + 
				"      float: left;\r\n" + 
				"      white-space: nowrap;\r\n" + 
				"    }\r\n" + 
				"    .top-left img {\r\n" + 
				"      margin-right: 10px;\r\n" + 
				"    }\r\n" + 
				"    .top-right {\r\n" + 
				"      float: right;\r\n" + 
				"    }\r\n" + 
				"    .title{\r\n" + 
				"      padding: 0;\r\n" + 
				"      margin: 0;\r\n" + 
				"    }\r\n" + 
				"    .title dt{\r\n" + 
				"      font-size: 16px;\r\n" + 
				"      width: 100%;\r\n" + 
				"      text-align: center;\r\n" + 
				"      font-weight: bold;\r\n" + 
				"    }\r\n" + 
				"    .title dd{\r\n" + 
				"      text-align: right\r\n" + 
				"    }\r\n" + 
				"    .table-con table{\r\n" + 
				"      width: 100%;\r\n" + 
				"      border-left: #7f7f7f 1px solid;\r\n" + 
				"      border-top: #7f7f7f 1px solid;\r\n" + 
				"      border-collapse: collapse;\r\n" + 
				"    }\r\n" + 
				"    .table-con table td{\r\n" + 
				"      border-right: #7f7f7f 1px solid;\r\n" + 
				"      border-bottom: #7f7f7f 1px solid;\r\n" + 
				"      padding-left: 3px;\r\n" + 
				"      white-space: nowrap;\r\n" + 
				"      overflow:hidden;\r\n" + 
				"    }\r\n" + 
				"    .foot{\r\n" + 
				"      position: absolute;\r\n" + 
				"      bottom: 5px;\r\n" + 
				"      left: 0;\r\n" + 
				"      right: 0;\r\n" + 
				"      padding: 0 20px;\r\n" + 
				"    }\r\n" + 
				"    .foot div{\r\n" + 
				"      width: 48%;\r\n" + 
				"      display: inline-block;\r\n" + 
				"    }\r\n" + 
				"  </style>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"  <div class=\"pre-main\">\r\n" + 
				"    <div class=\"clearfix top\">\r\n" + 
				"      <div class=\"top-left\">\r\n" + 
				"        <img src=\"data:image/jpeg;base64,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AAAASAAvZmYAAQBsZmYABgAAAAAAAQAvZmYAAQChmZoABgAAAAAAAQAyAAAAAQBaAAAABgAAAAAAAQA1AAAAAQAtAAAABgAAAAAAAThCSU0D+AAAAAAAcAAA/////////////////////////////wPoAAAAAP////////////////////////////8D6AAAAAD/////////////////////////////A+gAAAAA/////////////////////////////wPoAAA4QklNBAgAAAAAABAAAAABAAACQAAAAkAAAAAAOEJJTQQeAAAAAAAEAAAAADhCSU0EGgAAAAADWwAAAAYAAAAAAAAAAAAAACMAAABrAAAAE1+uT+FW/nJHAF8AMgAwADEAOQAwADcAMgAyADEANgAzADUAMQAyAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAABAAAAAAAAAAAAAABrAAAAIwAAAAAAAAAAAAAAAAAAAAABAAAAAAAAAAAAAAAAAAAAAAAAABAAAAABAAAAAAAAbnVsbAAAAAIAAAAGYm91bmRzT2JqYwAAAAEAAAAAAABSY3QxAAAABAAAAABUb3AgbG9uZwAAAAAAAAAATGVmdGxvbmcAAAAAAAAAAEJ0b21sb25nAAAAIwAAAABSZ2h0bG9uZwAAAGsAAAAGc2xpY2VzVmxMcwAAAAFPYmpjAAAAAQAAAAAABXNsaWNlAAAAEgAAAAdzbGljZUlEbG9uZwAAAAAAAAAHZ3JvdXBJRGxvbmcAAAAAAAAABm9yaWdpbmVudW0AAAAMRVNsaWNlT3JpZ2luAAAADWF1dG9HZW5lcmF0ZWQAAAAAVHlwZWVudW0AAAAKRVNsaWNlVHlwZQAAAABJbWcgAAAABmJvdW5kc09iamMAAAABAAAAAAAAUmN0MQAAAAQAAAAAVG9wIGxvbmcAAAAAAAAAAExlZnRsb25nAAAAAAAAAABCdG9tbG9uZwAAACMAAAAAUmdodGxvbmcAAABrAAAAA3VybFRFWFQAAAABAAAAAAAAbnVsbFRFWFQAAAABAAAAAAAATXNnZVRFWFQAAAABAAAAAAAGYWx0VGFnVEVYVAAAAAEAAAAAAA5jZWxsVGV4dElzSFRNTGJvb2wBAAAACGNlbGxUZXh0VEVYVAAAAAEAAAAAAAlob3J6QWxpZ25lbnVt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enJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjYtYzE0MiA3OS4xNjA5MjQsIDIwMTcvMDcvMTMtMDE6MDY6MzkgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcE1NPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvbW0vIiB4bWxuczpzdEV2dD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL3NUeXBlL1Jlc291cmNlRXZlbnQjIiB4bWxuczpkYz0iaHR0cDovL3B1cmwub3JnL2RjL2VsZW1lbnRzLzEuMS8iIHhtbG5zOnBob3Rvc2hvcD0iaHR0cDovL25zLmFkb2JlLmNvbS9waG90b3Nob3AvMS4wLyIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bXBNTTpEb2N1bWVudElEPSJhZG9iZTpkb2NpZDpwaG90b3Nob3A6YjNhMTEzYjEtZjQzZC04NjRiLWFmODQtMDJmMjJmNzA0ODA5IiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOmY2OGRmNDQ5LTdjN2MtY2I0MS1hYjI0LWMwYjFiNWNlMGUxYyIgeG1wTU06T3JpZ2luYWxEb2N1bWVudElEPSI3OTQ4Mjc5MjRCQ0ZEN0U1QTBDM0VDOTRCNUY3NDA0NSIgZGM6Zm9ybWF0PSJpbWFnZS9qcGVnIiBwaG90b3Nob3A6Q29sb3JNb2RlPSIzIiBwaG90b3Nob3A6SUNDUHJvZmlsZT0iIiB4bXA6Q3JlYXRlRGF0ZT0iMjAxOS0wNy0yMlQxNjozNToyMyswODowMCIgeG1wOk1vZGlmeURhdGU9IjIwMTktMDgtMjBUMTM6NTA6MzcrMDg6MDAiIHhtcDpNZXRhZGF0YURhdGU9IjIwMTktMDgtMjBUMTM6NTA6MzcrMDg6MDAiPiA8eG1wTU06SGlzdG9yeT4gPHJkZjpTZXE+IDxyZGY6bGkgc3RFdnQ6YWN0aW9uPSJzYXZlZCIgc3RFdnQ6aW5zdGFuY2VJRD0ieG1wLmlpZDpjNDU5OWFmZC1jYTU2LTAzNDktOTg5ZC1hNzI0MDM3OTE5YTkiIHN0RXZ0OndoZW49IjIwMTktMDgtMjBUMTM6NTA6MzcrMDg6MDAiIHN0RXZ0OnNvZnR3YXJlQWdlbnQ9IkFkb2JlIFBob3Rvc2hvcCBDQyAoV2luZG93cykiIHN0RXZ0OmNoYW5nZWQ9Ii8iLz4gPHJkZjpsaSBzdEV2dDphY3Rpb249InNhdmVkIiBzdEV2dDppbnN0YW5jZUlEPSJ4bXAuaWlkOmY2OGRmNDQ5LTdjN2MtY2I0MS1hYjI0LWMwYjFiNWNlMGUxYyIgc3RFdnQ6d2hlbj0iMjAxOS0wOC0yMFQxMzo1MDozNyswODowMCIgc3RFdnQ6c29mdHdhcmVBZ2VudD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSIgc3RFdnQ6Y2hhbmdlZD0iLyIvPiA8L3JkZjpTZXE+IDwveG1wTU06SGlzdG9yeT4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgPD94cGFja2V0IGVuZD0idyI/Pv/uAA5BZG9iZQBkQAAAAAH/2wCEAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQECAgICAgICAgICAgMDAwMDAwMDAwMBAQEBAQEBAQEBAQICAQICAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDA//AABEI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\" alt=\"\"/>\r\n" + 
				"        XIN SANLY REEFER CONTAINER TECHNICAL CO.LTD\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"top-right\">\r\n" + 
				"        Tel:0086-532-86908252<br/>\r\n" + 
				"        Fax:0086-532-86912188<br/>\r\n" + 
				"        E-mail:wqh@sanly.cn\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <div>\r\n" + 
				"      <dl class=\"title\">\r\n" + 
				"        <dt>Pre-Trip Inspection</dt>\r\n" + 
				"        <dd>XSL/QR-JZ-11</dd>\r\n" + 
				"      </dl>\r\n" + 
				"      <div class=\"table-con\">\r\n" + 
				"        <table>\r\n" + 
				"          <tbody>\r\n" + 
				"            <tr>\r\n" + 
				"              <td>Owner：ASL(亚海)</td>\r\n" + 
				"              <td colspan=\"2\">Container No：TTNU8575416</td>\r\n" + 
				"              <td colspan=\"1\">Unit Model：</td>\r\n" + 
				"              <td colspan=\"3\">Inspection Date：\r\n" + 
				"				</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td>Place：大亚北站</td>\r\n" + 
				"              <td colspan=\"2\">Ambient Temp：6华氏度</td>\r\n" + 
				"              <td colspan=\"4\">Type：</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"7\"><big><b>Visual Check</b></big></td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">1.Check container interior and exterior for odors and damage：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">2.Chean unit and check for leakage：</td>\r\n" + 
				"              <td  align=\"center\">NOTOK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">3.Check fasteners：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">4.Check drain hose：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"7\"><big><b>Electrical Check</b></big></td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">5.Check wiring terminals and connections in control boxes：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">6.Check power plugs and cables：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"2\">7.Check insulition resistance：</td>\r\n" + 
				"              <td>Comp：23</td>\r\n" + 
				"              <td>EF：55</td>\r\n" + 
				"              <td>CF：5.3</td>\r\n" + 
				"              <td>HR：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"7\"><big><b>Operation Check</b></big></td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">8.Check indicate lamps：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">9.Check container ID and calendar and ensure control software version is the newest version：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">10.Operate unit at 32 F(0℃)：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">11.Check rotation of condenser and evaporator fans：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"3\">12.Check power supply voltage：</td>\r\n" + 
				"              <td>L1-L2： V</td>\r\n" + 
				"              <td>L2-L3：5 V</td>\r\n" + 
				"              <td>L1-L3： V</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"3\">13.Check current draw of evaporator fans(hign speed)：</td>\r\n" + 
				"              <td>L1： A</td>\r\n" + 
				"              <td>L2： A</td>\r\n" + 
				"              <td>L3： A</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"3\">14.Check current draw of condenser fans：</td>\r\n" + 
				"              <td>L1： A</td>\r\n" + 
				"              <td>L2： A</td>\r\n" + 
				"              <td>L3： A</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"3\">15.Check current draw of condenser NO.1：</td>\r\n" + 
				"              <td>L1： A</td>\r\n" + 
				"              <td>L2： A</td>\r\n" + 
				"              <td>L3： A</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">16.Check current draw of condenser NO.2：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">17.Put heat on unit：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"3\">18.Check current draw of main heaters：</td>\r\n" + 
				"              <td>L1： A</td>\r\n" + 
				"              <td>L2：9 V</td>\r\n" + 
				"              <td>L3： V</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">19.Check current draw of sub heaters：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">20.Check refrigerant pressure at 32 F(0℃)：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">21.Temperature recorder calibration：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">22.Down to 32 F(0℃)time needed：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">23.Check operation of high pressure switch：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">24.Check defrost cycle：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">25.Operate unit at 0 F(-18℃)：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"3\">26.Check current draw of evaporator fans(low speed)：</td>\r\n" + 
				"              <td>L1： A</td>\r\n" + 
				"              <td>L2： A</td>\r\n" + 
				"              <td>L3： A</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"3\">27.Check refrigerant level and moisture indivaror：</td>\r\n" + 
				"              <td colspan=\"1\">RefrigerantFull：</td>\r\n" + 
				"              <td colspan=\"3\">MoistureIndicatorColor：</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"7\"><big><b>Final Check</b></big></td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"4\">28.Check compressor oil level：</td>\r\n" + 
				"              <td colspan=\"2\">Level：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">29.Down to 0 f(-18℃) time needeed：</td>\r\n" + 
				"              <td  align=\"center\">OK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">30.Wind temerature recorder and check operation：</td>\r\n" + 
				"              <td  align=\"center\">NOTOK</td>\r\n" + 
				"            </tr>\r\n" + 
				"            <tr>\r\n" + 
				"              <td colspan=\"6\">31.Check chart clock(cell operation)：</td>\r\n" + 
				"              <td  align=\"center\">NC</td>\r\n" + 
				"            </tr>\r\n" + 
				"          </tbody>\r\n" + 
				"        </table>\r\n" + 
				"        <div class=\"foot\">\r\n" + 
				"            <div>Mechanic's signature：sb</div>\r\n" + 
				"            <div>Remarks：2b</div>\r\n" + 
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>";
		createPdf(content,"F:\\a.pdf");
		System.out.println("over");
	}
	private static final String FONT = "simsun.ttc";

	public static void createPdf(String content,String destFileFullPath) {
		try {
            ITextRenderer render = new ITextRenderer();
            //解决中文不显式问题
            ITextFontResolver fontResolver = render.getFontResolver();
            fontResolver.addFont(FONT,BaseFont.IDENTITY_H,BaseFont.NOT_EMBEDDED);
            // 解析html生成pdf
            render.setDocumentFromString(content);
            //解决图片相对路径的问题
//            render.getSharedContext().setBaseURL(LOGO_PATH);
            render.layout();
            render.createPDF(new FileOutputStream(destFileFullPath));
        }catch (Exception e) {
            e.printStackTrace();
        }
	}
}
