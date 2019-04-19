<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container" align="center">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>

    <div class="container">
        
        <form>
            <input type="date" class="date-picker-popup">
            <input type="submit" value="Set Date">
        </form>
    </div>


</div>
<%@include file="commons/footer.jspf"%>
