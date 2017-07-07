package com.mimacom.sample.spring.portlet.controller;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.mimacom.sample.spring.portlet.controller.Keys.Views;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ViewController extends GenericPortlet {
    private static final Log LOGGER = LogFactoryUtil.getLog(ViewController.class);

    @RenderMapping
    public String defaultView() {

        if (LOGGER.isTraceEnabled()) {
            LOGGER.trace("Default View");
        }

        return Views.DEFAULT_VIEW;
    }

    @ResourceMapping(value = "resource-one")
    public void resourceOne(ResourceResponse resourceResponse) throws PortletException {
        if (LOGGER.isTraceEnabled()) {
            LOGGER.trace("Resource one");
        }

        try {
            resourceResponse.setContentType("text/html");
            PrintWriter writer = resourceResponse.getWriter();
            writer.println("<p>This request handle the complete response. This is usefull to return JSON, images, files or any other resource that are needed by our portlets</p>");
        } catch (IOException e) {
            throw new PortletException(e);
        }
    }

    protected void writeJSON(ResourceResponse response, String json) throws IOException {
        response.setContentType("application/json");
        PrintWriter writer = response.getWriter();
        writer.write(json);
    }


}
