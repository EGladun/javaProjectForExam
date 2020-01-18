
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="main.css" type="text/css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>Upload Page</title>
</head>
<body>
<header class="header"></header>
<div class="navbar container">
    <a href="main.jsp">HOME</a>
    <a href="upload.jsp">UPLOAD</a>
    <a href="index.jsp">DOWNLOAD</a>
</div>
<form method="post" class="upload_form container">
    <div class="example-1">
        <div class="form-group">
            <label class="label">
                <i class="material-icons">attach_file</i>
                <span class="title">Добавить файл</span>
                <input class="file" type="file">
            </label>
        </div>
    </div>
    <input class="submit" type="submit" value="Отправить">
</form>
</body>
<script src="upload.js"></script>
<style>
    body{
        padding: 0;
        margin: 0;
        font-family: Arial, sans-serif;
    }

    .flexbox{
        display: flex;
    }

    .container{
        margin-left: 20%;
        margin-right: 20%;
        display: flex;
        justify-content: center;
        align-content: space-between;
        align-items: center;
    }

    .header{
        width: 100%;
        height: 30px;
        background-color: grey;
    }

    .navbar{
        display: flex;
        justify-content: center;
        align-content: space-between;
        width: 60%;
        height: 50px;
    }

    .navbar>a{
        width: 300px;
        text-align: center;
        margin: auto;
        font-size: 20px;
        text-decoration: none;
        color: grey;
        font-family: Arial, sans-serif;
    }

    .navbar>a:hover{
        color:black;
        cursor: pointer;
    }

    .submit{
        width: 100px;
        height: 30px;
        color: whitesmoke;
        background-color: grey;
        border: 1px solid grey;
        border-radius: 15px;
    }

    .submit:hover{
        background-color: black;
        color: whitesmoke;
    }

    .example-1 .form-group{padding:1em;margin:1em}
    .example-1 input[type=file]{outline:0;opacity:0;pointer-events:none;user-select:none}
    .example-1 .label{width:120px;border:2px dashed grey;border-radius:5px;display:block;padding:1.2em;transition:border 300ms ease;cursor:pointer;text-align:center}
    .example-1 .label i{display:block;font-size:42px;padding-bottom:16px}
    .example-1 .label i,.example-1 .label .title{color:grey;transition:200ms color}
    .example-1 .label:hover{border:2px solid #000}
    .example-1 .label:hover i,.example-1 .label:hover .title{color:#000}

    form{
        display: flex;
        flex-direction: column;
        align-items: center;
    }
</style>
</html>
