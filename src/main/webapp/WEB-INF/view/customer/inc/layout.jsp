<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><tiles:getAsString name="title"/></title>
    
    <link href="/css/customer/layout.css" type="text/css" rel="stylesheet" />
    <style>
    
        #visual .content-container{ 
            height:inherit;
            display:flex; 
            align-items: center;
            
            background: url("../../images/customer/visual.png") no-repeat center;
        }
    </style>
</head>

<body>
    <!--  header 부분 -->
    <!--  tiles.xml의 header attribute에 대응 -->
    <tiles:insertAttribute name="header"/>
    <!-- --------------------------- <visual> --------------------------------------- -->
	<!-- visual 부분 -->
	<!--  tiles.xml의 visual attribute에 대응 -->	
	<tiles:insertAttribute name="visual"/>
	<!-- --------------------------- <body> --------------------------------------- -->
	<div id="body">
		<div class="content-container clearfix">
			<!-- --------------------------- aside --------------------------------------- -->
			<!-- aside 부분 -->
			<!--  tiles.xml의 aside attribute에 대응 -->
			<tiles:insertAttribute name="aside"/>
			<!-- --------------------------- main --------------------------------------- -->
			<!--  tiles.xml의 body attribute에 대응 -->
			<tiles:insertAttribute name="main"/>					
		</div>
	</div>
	<!-- ------------------- <footer> --------------------------------------- -->
	<!--  tiles.xml의 footer attribute에 대응 -->
    <tiles:insertAttribute name="footer"/>    
</body>    
</html>