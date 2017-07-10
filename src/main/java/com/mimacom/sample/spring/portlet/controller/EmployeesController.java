package com.mimacom.sample.spring.portlet.controller;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.mimacom.sample.spring.portlet.util.FormatUtils;
import com.owlafrica.servicebuilder.model.Employee;
import com.owlafrica.servicebuilder.service.EmployeeLocalServiceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.util.List;

@Controller
@RequestMapping("VIEW")
public class EmployeesController extends ViewController{

    @ResourceMapping("employeesList")
    public void employeesList(ResourceRequest req, ResourceResponse resp) throws SystemException {
        String strDepID = req.getParameter("id");
        Long depID = FormatUtils.getLongFromStr(strDepID);
         DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Employee.class, PortalClassLoaderUtil.getClassLoader());
        dynamicQuery.add(PropertyFactoryUtil.forName("id").eq(depID));
        List<Employee> employees = EmployeeLocalServiceUtil.dynamicQuery(dynamicQuery);
    }

    /*
    *     @ResourceMapping(value = "depAll")
    public void depAll(ResourceRequest req, ResourceResponse resp) throws SystemException, IOException {
        HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
        PortalUtil.getOriginalServletRequest(httpReq).getParameter("name");
        String strDepID = req.getParameter("id");
        String name = req.getParameter("name");
        List<Department> departments = DepartmentLocalServiceUtil.getDepartments(0, 99);
        writeJSON(resp, JSON.toJSONString(departments));
    }

    @ResourceMapping(value = "editDepartment")
    public void editDepartment(ResourceRequest req, ResourceResponse resp) throws SystemException, PortalException, IOException {
        String strDepID = req.getParameter("id");
        Long depID = FormatUtils.getLongFromStr(strDepID);
        Department department = new DepartmentImpl();
        if (depID != null) {
            department = DepartmentLocalServiceUtil.getDepartment(depID);
        }
        writeJSON(resp, JSON.toJSONString(department));
    }
    */
}
