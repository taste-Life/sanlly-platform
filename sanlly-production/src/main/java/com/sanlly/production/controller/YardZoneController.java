package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.yardZone.YardZoneInputAdd;
import com.sanlly.production.models.input.yardZone.YardZoneInputUpdate;
import com.sanlly.production.models.input.yardZone.ZoneSearchInput;
import com.sanlly.production.models.output.yardZone.YardZoneOutput;
import com.sanlly.production.models.output.yardZone.ZoneListOutput;
import com.sanlly.production.service.YardZoneService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "场站区位接口")
public class YardZoneController {

    @Autowired
    private YardZoneService yardZoneService;

    /**
     * 搜索区位列表
     *
     * @param yard
     * @param zoneCode
     * @return
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/zones/page")
    public Result getZonePagedList(
            @RequestParam(value = "yard", required = false) String yard,
            @RequestParam(value = "zoneCode", required = false) String zoneCode,
            @RequestParam(value = "index") Integer index,
            @RequestParam(value = "size") Integer size
    ) {
        ZoneSearchInput input = new ZoneSearchInput();
        input.setYard(yard);
        input.setZoneCode(zoneCode);
        input.setIndex(index);
        input.setSize(size);
        return Result.Success(yardZoneService.getZoneList(input));
    }

    /**
     * @author zhq
     * @date 2019/10/29
     * @description 根据yardid查询zone列表
     */
    @GetMapping("/getZoneListByYardKey")
    public Result<List<ZoneListOutput>> getZoneListByYardKey(String yardKey) {
        return Result.Success(yardZoneService.getZoneListByYardKey(yardKey));
    }

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 新增场站区位表
     */
    @PostMapping("/addYardZone")
    public Result<Integer> addYardZone(@RequestBody YardZoneInputAdd yardZoneInputAdd) {
        return Result.Success(yardZoneService.addYardZone(yardZoneInputAdd));
    }

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 修改场站区位
     */
    @PutMapping("/updateYardZone")
    public Result<Integer> updateYardZone(@RequestBody YardZoneInputUpdate yardZoneInputUpdate) {
        return Result.Success(yardZoneService.updateYardZone(yardZoneInputUpdate));
    }

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 删除场站区位
     */
    @DeleteMapping("/deleteYardZone")
    public Result<Integer> deleteYardZone(Integer[] ids) {
        return Result.Success(yardZoneService.deleteYardZone(ids));
    }

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 设置有效无效
     */
    @PutMapping("/validateYardZone")
    public Result<Integer> validateYardZone(Integer[] ids, Integer valid) {
        return Result.Success(yardZoneService.validateYardZone(ids, valid));
    }

    /**
     * @author zhq
     * @date 2019/11/4
     * @description 分页查询
     */
    @GetMapping("/getYardZoneList")
    public Result<PagedList<YardZoneOutput>> getYardZoneList(Integer index, Integer size, String searchWords) {
        Assert.notNull(index, "页码index不能为空");
        Assert.notNull(size, "页面记录数size不能为空");
        return Result.Success(yardZoneService.getYardZoneList(index, size, searchWords));
    }
}
