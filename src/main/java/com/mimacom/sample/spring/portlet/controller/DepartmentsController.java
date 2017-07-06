package com.mimacom.sample.spring.portlet.controller;


import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.util.PortalUtil;
import com.mimacom.sample.spring.portlet.util.FormatUtils;
import com.owlafrica.servicebuilder.model.Department;
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
    public void depAll(ResourceRequest req, ResourceResponse resp) throws SystemException {
        HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);

        PortalUtil.getOriginalServletRequest(httpReq).getParameter("name");
        List<Department> departments = null;//departmentService.getAll();
        String strDepID = req.getParameter("id");
        String name = req.getParameter("name");
        //departments = DepartmentLocalServiceUtil.getDepartments(0,999999);
        req.setAttribute("departmens", departments);
    }

    @ResourceMapping(value = "editDepartment")
    public void editDepartment(ResourceRequest req, ResourceResponse resp) {

        String strDepID = req.getParameter("id");
        String name = req.getParameter("name");
        Long depID = FormatUtils.getLongFromStr(strDepID);
        req.setAttribute("depID", depID);
        req.setAttribute("name", name);

    }

    @ResourceMapping(value = "deleteDep")
    public void delDep(ResourceRequest req, ResourceResponse resp) {
        String strDepID = req.getParameter("id");
        Long depID = FormatUtils.getLongFromStr(strDepID);

    }

    @ResourceMapping(value = "depSave")
    public void depSave (ResourceRequest req, ResourceResponse resp) {
        String strDepID = req.getParameter("id");
        String name = req.getParameter("name");
        Long depID = FormatUtils.getLongFromStr(strDepID);
       // departmentService.saveOrUpdateDepartment(department);
        req.setAttribute("depID", depID);
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
/*    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/deps", method = RequestMethod.GET)
    @ResponseBody
    public List<Department> getUsers() throws DaoExp {
        List<Department> departments = departmentService.getAll();
        return departments;
    }

    @RequestMapping(value = "/editDepartment", method = RequestMethod.GET)
    @ResponseBody
    public Department editDepartment(Long depID) throws DaoExp {
        Department department = null;
        if (depID != null) department = departmentService.getDepartmentById(depID);
        return department;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome() {
        return "start";
    }

    @ResponseBody
    @RequestMapping(value = "/depSave", method = RequestMethod.POST)
    public JsonObject depSave(Department department) throws DaoExp, ValidateExp {
        JsonObject jsonObject = new JsonObject();
        departmentService.saveOrUpdateDepartment(department);
        jsonObject.setDepartment(department);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping(value = "/deleteDep", method = RequestMethod.POST)
    public String depDelete(Long depID) throws DaoExp {
        departmentService.getDepartmentById(depID);
        departmentService.deleteDepartment(depID);
        return depID.toString();
    }
*/


}
