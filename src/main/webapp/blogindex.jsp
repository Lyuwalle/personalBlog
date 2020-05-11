<%--blogindex.jsp 是项目的欢迎页面，它的作用是访问这个页面时，自动加载 js，
执行查询博客文章的操作，然后跳转到真正的主页 index.jsp ，起着一个中介的作用。
设计这个页面是为了避免之后需要通过按钮或链接等跳转到主页时可能会出现循环跳转的情况。--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <title>Insert title here</title>
    <script>
        $(function () {
            window.location.href = 'selectAllBlog';
        })
    </script>
</head>
<body>

</body>

</html>