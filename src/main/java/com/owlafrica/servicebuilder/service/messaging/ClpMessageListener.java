package com.owlafrica.servicebuilder.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.owlafrica.servicebuilder.service.ClpSerializer;
import com.owlafrica.servicebuilder.service.DepartmentLocalServiceUtil;
import com.owlafrica.servicebuilder.service.DepartmentServiceUtil;
import com.owlafrica.servicebuilder.service.EmployeeLocalServiceUtil;
import com.owlafrica.servicebuilder.service.EmployeeServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            DepartmentLocalServiceUtil.clearService();

            DepartmentServiceUtil.clearService();
            EmployeeLocalServiceUtil.clearService();

            EmployeeServiceUtil.clearService();
        }
    }
}
