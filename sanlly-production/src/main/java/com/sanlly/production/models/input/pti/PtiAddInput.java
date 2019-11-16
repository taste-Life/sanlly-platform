package com.sanlly.production.models.input.pti;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * pti信息录入类
 * @author RexSheng
 * 2019年8月19日 上午10:48:57
 */
public class PtiAddInput {
	/**
	 * 用箱人
	 */
	private String owner;

	/**
	 * 箱号
	 */
    private String containerNo;

    /**
     * 机型
     */
    private String unitModel;

    /**
     * 检验日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date inspectionDate;

    private String place;

    private String ambientTemp;
    
    private String tempUnit;

    private String type;

    private String unitSn;

    private String controllerSn;

    private String compressorSn;

    private String mrbSn;

    private String erecorderSn;

    private String rmmId;

    private String softwareNo;

    private String manufactureDate;

    private String isHumidity;

    private String isTemperature;

    private String unitCompanyId;

    private String checkContainer;

    private String cleanUnit;

    private String checkFasteners;

    private String checkDrain;

    private String checkWiring;

    private String checkPower;

    private String checkInsulation;

    private String comp;

    private String ef;

    private String cf;

    private String hr;

    private String checkIndicate;

    private String checkContainerId;

    private String operate;

    private String checkRotation;

    private String checkPowerSupply;

    private String l1L2;

    private String l2L3;

    private String l1L3;

    private String checkEvaporator;

    private String checkEvaporatorL1;

    private String checkEvaporatorL2;

    private String checkEvaporatorL3;

    private String checkCurrent;

    private String checkCurrentL1;

    private String checkCurrentL2;

    private String checkCurrentL3;

    private String checkNo1;

    private String checkNo1L1;

    private String checkNo1L2;

    private String checkNo1L3;

    private String checkNo2;

    private String putHeat;

    private String checkMainHeaters;

    private String checkMainHeatersL1;

    private String checkMainHeatersL2;

    private String checkMainHeatersL3;

    private String checkSubHeaters;

    private String checkRefrigerant;

    private String temperature;

    private String downTo32;

    private String checkOperation;

    private String checkDefost;

    private String operateUnit;

    private String checkFans;

    private String checkFansL1;

    private String checkFansL2;

    private String checkFansL3;

    private String checkRefrigerantLevel;

    private String refrigerantFull;

    private String monistureColor;

    private String checkCompressor;

    private String checkCompressorLevel;

    private String downTo0;

    private String windTemerature;

    private String checkChart;

    private String mechanic;

    private String remarks;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getUnitModel() {
		return unitModel;
	}

	public void setUnitModel(String unitModel) {
		this.unitModel = unitModel;
	}

	public Date getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getAmbientTemp() {
		return ambientTemp;
	}

	public void setAmbientTemp(String ambientTemp) {
		this.ambientTemp = ambientTemp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnitSn() {
		return unitSn;
	}

	public void setUnitSn(String unitSn) {
		this.unitSn = unitSn;
	}

	public String getControllerSn() {
		return controllerSn;
	}

	public void setControllerSn(String controllerSn) {
		this.controllerSn = controllerSn;
	}

	public String getCompressorSn() {
		return compressorSn;
	}

	public void setCompressorSn(String compressorSn) {
		this.compressorSn = compressorSn;
	}

	public String getMrbSn() {
		return mrbSn;
	}

	public void setMrbSn(String mrbSn) {
		this.mrbSn = mrbSn;
	}

	public String getErecorderSn() {
		return erecorderSn;
	}

	public void setErecorderSn(String erecorderSn) {
		this.erecorderSn = erecorderSn;
	}

	public String getRmmId() {
		return rmmId;
	}

	public void setRmmId(String rmmId) {
		this.rmmId = rmmId;
	}

	public String getSoftwareNo() {
		return softwareNo;
	}

	public void setSoftwareNo(String softwareNo) {
		this.softwareNo = softwareNo;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getIsHumidity() {
		return isHumidity;
	}

	public void setIsHumidity(String isHumidity) {
		this.isHumidity = isHumidity;
	}

	public String getIsTemperature() {
		return isTemperature;
	}

	public void setIsTemperature(String isTemperature) {
		this.isTemperature = isTemperature;
	}

	public String getUnitCompanyId() {
		return unitCompanyId;
	}

	public void setUnitCompanyId(String unitCompanyId) {
		this.unitCompanyId = unitCompanyId;
	}

	public String getCheckContainer() {
		return checkContainer;
	}

	public void setCheckContainer(String checkContainer) {
		this.checkContainer = checkContainer;
	}

	public String getCleanUnit() {
		return cleanUnit;
	}

	public void setCleanUnit(String cleanUnit) {
		this.cleanUnit = cleanUnit;
	}

	public String getCheckFasteners() {
		return checkFasteners;
	}

	public void setCheckFasteners(String checkFasteners) {
		this.checkFasteners = checkFasteners;
	}

	public String getCheckDrain() {
		return checkDrain;
	}

	public void setCheckDrain(String checkDrain) {
		this.checkDrain = checkDrain;
	}

	public String getCheckWiring() {
		return checkWiring;
	}

	public void setCheckWiring(String checkWiring) {
		this.checkWiring = checkWiring;
	}

	public String getCheckPower() {
		return checkPower;
	}

	public void setCheckPower(String checkPower) {
		this.checkPower = checkPower;
	}

	public String getCheckInsulation() {
		return checkInsulation;
	}

	public void setCheckInsulation(String checkInsulation) {
		this.checkInsulation = checkInsulation;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getEf() {
		return ef;
	}

	public void setEf(String ef) {
		this.ef = ef;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
	}

	public String getCheckIndicate() {
		return checkIndicate;
	}

	public void setCheckIndicate(String checkIndicate) {
		this.checkIndicate = checkIndicate;
	}

	public String getCheckContainerId() {
		return checkContainerId;
	}

	public void setCheckContainerId(String checkContainerId) {
		this.checkContainerId = checkContainerId;
	}

	public String getOperate() {
		return operate;
	}

	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getCheckRotation() {
		return checkRotation;
	}

	public void setCheckRotation(String checkRotation) {
		this.checkRotation = checkRotation;
	}

	public String getCheckPowerSupply() {
		return checkPowerSupply;
	}

	public void setCheckPowerSupply(String checkPowerSupply) {
		this.checkPowerSupply = checkPowerSupply;
	}

	public String getL1L2() {
		return l1L2;
	}

	public void setL1L2(String l1l2) {
		l1L2 = l1l2;
	}

	public String getL2L3() {
		return l2L3;
	}

	public void setL2L3(String l2l3) {
		l2L3 = l2l3;
	}

	public String getL1L3() {
		return l1L3;
	}

	public void setL1L3(String l1l3) {
		l1L3 = l1l3;
	}

	public String getCheckEvaporator() {
		return checkEvaporator;
	}

	public void setCheckEvaporator(String checkEvaporator) {
		this.checkEvaporator = checkEvaporator;
	}

	public String getCheckEvaporatorL1() {
		return checkEvaporatorL1;
	}

	public void setCheckEvaporatorL1(String checkEvaporatorL1) {
		this.checkEvaporatorL1 = checkEvaporatorL1;
	}

	public String getCheckEvaporatorL2() {
		return checkEvaporatorL2;
	}

	public void setCheckEvaporatorL2(String checkEvaporatorL2) {
		this.checkEvaporatorL2 = checkEvaporatorL2;
	}

	public String getCheckEvaporatorL3() {
		return checkEvaporatorL3;
	}

	public void setCheckEvaporatorL3(String checkEvaporatorL3) {
		this.checkEvaporatorL3 = checkEvaporatorL3;
	}

	public String getCheckCurrent() {
		return checkCurrent;
	}

	public void setCheckCurrent(String checkCurrent) {
		this.checkCurrent = checkCurrent;
	}

	public String getCheckCurrentL1() {
		return checkCurrentL1;
	}

	public void setCheckCurrentL1(String checkCurrentL1) {
		this.checkCurrentL1 = checkCurrentL1;
	}

	public String getCheckCurrentL2() {
		return checkCurrentL2;
	}

	public void setCheckCurrentL2(String checkCurrentL2) {
		this.checkCurrentL2 = checkCurrentL2;
	}

	public String getCheckCurrentL3() {
		return checkCurrentL3;
	}

	public void setCheckCurrentL3(String checkCurrentL3) {
		this.checkCurrentL3 = checkCurrentL3;
	}

	public String getCheckNo1() {
		return checkNo1;
	}

	public void setCheckNo1(String checkNo1) {
		this.checkNo1 = checkNo1;
	}

	public String getCheckNo1L1() {
		return checkNo1L1;
	}

	public void setCheckNo1L1(String checkNo1L1) {
		this.checkNo1L1 = checkNo1L1;
	}

	public String getCheckNo1L2() {
		return checkNo1L2;
	}

	public void setCheckNo1L2(String checkNo1L2) {
		this.checkNo1L2 = checkNo1L2;
	}

	public String getCheckNo1L3() {
		return checkNo1L3;
	}

	public void setCheckNo1L3(String checkNo1L3) {
		this.checkNo1L3 = checkNo1L3;
	}

	public String getCheckNo2() {
		return checkNo2;
	}

	public void setCheckNo2(String checkNo2) {
		this.checkNo2 = checkNo2;
	}

	public String getPutHeat() {
		return putHeat;
	}

	public void setPutHeat(String putHeat) {
		this.putHeat = putHeat;
	}

	public String getCheckMainHeaters() {
		return checkMainHeaters;
	}

	public void setCheckMainHeaters(String checkMainHeaters) {
		this.checkMainHeaters = checkMainHeaters;
	}

	public String getCheckMainHeatersL1() {
		return checkMainHeatersL1;
	}

	public void setCheckMainHeatersL1(String checkMainHeatersL1) {
		this.checkMainHeatersL1 = checkMainHeatersL1;
	}

	public String getCheckMainHeatersL2() {
		return checkMainHeatersL2;
	}

	public void setCheckMainHeatersL2(String checkMainHeatersL2) {
		this.checkMainHeatersL2 = checkMainHeatersL2;
	}

	public String getCheckMainHeatersL3() {
		return checkMainHeatersL3;
	}

	public void setCheckMainHeatersL3(String checkMainHeatersL3) {
		this.checkMainHeatersL3 = checkMainHeatersL3;
	}

	public String getCheckSubHeaters() {
		return checkSubHeaters;
	}

	public void setCheckSubHeaters(String checkSubHeaters) {
		this.checkSubHeaters = checkSubHeaters;
	}

	public String getCheckRefrigerant() {
		return checkRefrigerant;
	}

	public void setCheckRefrigerant(String checkRefrigerant) {
		this.checkRefrigerant = checkRefrigerant;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getDownTo32() {
		return downTo32;
	}

	public void setDownTo32(String downTo32) {
		this.downTo32 = downTo32;
	}

	public String getCheckOperation() {
		return checkOperation;
	}

	public void setCheckOperation(String checkOperation) {
		this.checkOperation = checkOperation;
	}

	public String getCheckDefost() {
		return checkDefost;
	}

	public void setCheckDefost(String checkDefost) {
		this.checkDefost = checkDefost;
	}

	public String getOperateUnit() {
		return operateUnit;
	}

	public void setOperateUnit(String operateUnit) {
		this.operateUnit = operateUnit;
	}

	public String getCheckFans() {
		return checkFans;
	}

	public void setCheckFans(String checkFans) {
		this.checkFans = checkFans;
	}

	public String getCheckFansL1() {
		return checkFansL1;
	}

	public void setCheckFansL1(String checkFansL1) {
		this.checkFansL1 = checkFansL1;
	}

	public String getCheckFansL2() {
		return checkFansL2;
	}

	public void setCheckFansL2(String checkFansL2) {
		this.checkFansL2 = checkFansL2;
	}

	public String getCheckFansL3() {
		return checkFansL3;
	}

	public void setCheckFansL3(String checkFansL3) {
		this.checkFansL3 = checkFansL3;
	}

	public String getCheckRefrigerantLevel() {
		return checkRefrigerantLevel;
	}

	public void setCheckRefrigerantLevel(String checkRefrigerantLevel) {
		this.checkRefrigerantLevel = checkRefrigerantLevel;
	}

	public String getRefrigerantFull() {
		return refrigerantFull;
	}

	public void setRefrigerantFull(String refrigerantFull) {
		this.refrigerantFull = refrigerantFull;
	}

	public String getMonistureColor() {
		return monistureColor;
	}

	public void setMonistureColor(String monistureColor) {
		this.monistureColor = monistureColor;
	}

	public String getCheckCompressor() {
		return checkCompressor;
	}

	public void setCheckCompressor(String checkCompressor) {
		this.checkCompressor = checkCompressor;
	}

	public String getCheckCompressorLevel() {
		return checkCompressorLevel;
	}

	public void setCheckCompressorLevel(String checkCompressorLevel) {
		this.checkCompressorLevel = checkCompressorLevel;
	}

	public String getDownTo0() {
		return downTo0;
	}

	public void setDownTo0(String downTo0) {
		this.downTo0 = downTo0;
	}

	public String getWindTemerature() {
		return windTemerature;
	}

	public void setWindTemerature(String windTemerature) {
		this.windTemerature = windTemerature;
	}

	public String getCheckChart() {
		return checkChart;
	}

	public void setCheckChart(String checkChart) {
		this.checkChart = checkChart;
	}

	public String getMechanic() {
		return mechanic;
	}

	public void setMechanic(String mechanic) {
		this.mechanic = mechanic;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTempUnit() {
		return tempUnit;
	}

	public void setTempUnit(String tempUnit) {
		this.tempUnit = tempUnit;
	}
    
    
}
