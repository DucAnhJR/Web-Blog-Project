

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div style="background-color: #28a745 !important;" class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Topics</div>
        <ul class="list-group category_block">
            <c:forEach items="${listT}" var="o">
                <li class="list-group-item text-white ${tag == o.topID ? "active" : ""}"><a href="topic?tid=${o.topID}">${o.topName}</a></li>
            </c:forEach>

        </ul>
    </div>
    <div class="card bg-light mb-3">
        <div class="card-header bg-success text-white text-uppercase">Last post</div>
        <div class="card-body">
            <img class="img-fluid" src="${last.img}" />
            <h5 class="card-title">${last.title}</h5>
            <p class="card-text text">${last.description}</p>
            <p class="bloc_left_price">${last.date}</p>
        </div>
    </div>
</div>