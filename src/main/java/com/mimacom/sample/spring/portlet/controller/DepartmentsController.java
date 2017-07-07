package com.mimacom.sample.spring.portlet.controller;


import com.alibaba.fastjson.JSON;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.util.PortalUtil;
import com.mimacom.sample.spring.portlet.util.FormatUtils;
import com.owlafrica.servicebuilder.model.Department;
import com.owlafrica.servicebuilder.model.impl.DepartmentImpl;
import com.owlafrica.servicebuilder.service.DepartmentLocalServiceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("VIEW")
public class DepartmentsController extends ViewController {

    @ResourceMapping(value = "depAll")
    public void depAll(ResourceRequest req, ResourceResponse resp) throws SystemException, IOException {
        HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);

        PortalUtil.getOriginalServletRequest(httpReq).getParameter("name");

        String strDepID = req.getParameter("id");
        String name = req.getParameter("name");

        List<Department> departments = DepartmentLocalServiceUtil.getDepartments(0, 10);
        writeJSON(resp, JSON.toJSONString(departments));
    }

    @ResourceMapping(value = "editDepartment")
    public void editDepartment(ResourceRequest req, ResourceResponse resp) {

        String strDepID = req.getParameter("id");
        String name = req.getParameter("name");
        Long depID = FormatUtils.getLongFromStr(strDepID);
        req.setAttribute("depID", depID );
        req.setAttribute("name", name);

    }

    @ResourceMapping(value = "deleteDep")
    public void delDep(ResourceRequest req, ResourceResponse resp) {
        String strDepID = req.getParameter("id");
        Long depID = FormatUtils.getLongFromStr(strDepID);

    }

    @ResourceMapping(value = "depSave")
    public void depSave(ResourceRequest req, ResourceResponse resp) throws SystemException {
        String strDepID = req.getParameter("id");
        String name = req.getParameter("name");
       // Department department = null;
        //department.setName(name);
        DepartmentImpl department = new DepartmentImpl();
        if ((strDepID != null)&&(!strDepID.equals("") )) {
            Long depID = FormatUtils.getLongFromStr(strDepID);
           // department.setId(depID);
        } else {

            department.setName(name);
        }
        DepartmentLocalServiceUtil.addDepartment(department);
        // req.setAttribute("depID", depID);
    }

    @ResourceMapping(value = "getDepName")
    public void validate(ResourceRequest req, ResourceResponse resp) throws IOException {
        String name = req.getParameter("name");
        String value = req.getParameter("id");
        Long id = FormatUtils.getLongFromStr(value);

        // Department department = departmentService.getDepByName(name);
        //    Boolean result = (department == null || department.getId().equals(id));
        Boolean result = false;
        resp.getWriter().write(result.toString());
    }


}
