package com.mimacom.sample.spring.portlet.controller;

import com.alibaba.fastjson.JSON;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.mimacom.sample.spring.portlet.util.FormatUtils;
import com.owlafrica.servicebuilder.model.Employee;
import com.owlafrica.servicebuilder.model.impl.EmployeeImpl;
import com.owlafrica.servicebuilder.service.EmployeeLocalServiceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("VIEW")
public class EmployeesController extends ViewController {

    @ResourceMapping("employeesList")
    public void employeesList(ResourceRequest req, ResourceResponse resp) throws SystemException, IOException {
        String strDepID = req.getParameter("id");
        Long depID = FormatUtils.getLongFromStr(strDepID);
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Employee.class, PortalClassLoaderUtil.getClassLoader());
        dynamicQuery.add(PropertyFactoryUtil.forName("depID").eq(depID));
        List<Employee> employees = EmployeeLocalServiceUtil.dynamicQuery(dynamicQuery);
        writeJSON(resp, JSON.toJSONString(employees));
    }

    @ResourceMapping("employeeEdit")
    public void employeeEdit(ResourceRequest req, ResourceResponse resp) throws SystemException, PortalException, IOException {
        String strDepID = req.getParameter("depID");
        Long depID = FormatUtils.getLongFromStr(strDepID);

        String strEmpID = req.getParameter("id");
        Long empID = FormatUtils.getLongFromStr(strEmpID);

        Employee employee = new EmployeeImpl();
        if (empID != null) {
            employee = EmployeeLocalServiceUtil.getEmployee(empID);
        }
        writeJSON(resp, JSON.toJSONString(employee));
    }

    @ResourceMapping("empDelete")
    public void empDelete (ResourceRequest req, ResourceResponse resp) throws SystemException, PortalException, IOException {
        String strEmpID = req.getParameter("id");
        Long empID = FormatUtils.getLongFromStr(strEmpID);
        Employee employee = EmployeeLocalServiceUtil.deleteEmployee(empID);
        writeJSON(resp, JSON.toJSONString(employee));
    }

    @ResourceMapping("empSave")
    public void empSave(ResourceRequest req, ResourceResponse resp) throws SystemException, PortalException {
        String strDepID = req.getParameter("depID");
        Long depID = FormatUtils.getLongFromStr(strDepID);

        String strEmpID = req.getParameter("id");
        Long empID = FormatUtils.getLongFromStr(strEmpID);
        Employee employee = new EmployeeImpl();
        String strGrade = req.getParameter("grade");
        Integer grade = FormatUtils.getIntFromStr(strGrade);
        String strBirthday = req.getParameter("birthday");
        Date birthday = FormatUtils.getDateFromString(strBirthday);

        if ((empID != null)) {
            employee = EmployeeLocalServiceUtil.getEmployee(empID);
            employee.setFirstName(req.getParameter("firstName"));
            employee.setSecondName(req.getParameter("secondName"));
            employee.setEMail(req.getParameter("eMail"));
            employee.setGrade(grade);
            employee.setBirthday(birthday);
            EmployeeLocalServiceUtil.updateEmployee(employee);

        } else {
            employee.setDepID(depID);
            employee.setFirstName(req.getParameter("firstName"));
            employee.setSecondName(req.getParameter("secondName"));
            employee.setEMail(req.getParameter("eMail"));
            employee.setGrade(grade);
            employee.setBirthday(birthday);
            EmployeeLocalServiceUtil.addEmployee(employee);

            employee.getBirthday();
        }


    }

}
