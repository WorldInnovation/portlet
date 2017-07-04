<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>
<%@ include file="init.jsp"%>
<liferay-theme:defineObjects/>
<portlet:defineObjects/>

<div id="${ns}main">
    <h2><a href= "/"> Home </a></h2>
    <div id="${ns}start" class="container">
        <div id = "${ns}mainRow" class="row">
            <div id="${ns}content" class="mainView"></div>
            <h1>new Department </h1>
                <form href="${ns}depSave" name="depForm"  method="POST">
                    Dep Name<br/>
                    <input  type="text" name="${ns}name" id="${ns}id"/><br/>
                    <input type="submit" name="addDep" id="addDep" value="Add Dep"/>
                </form>
            </div>
        </div>

    </div>
</div>


