<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .here{background-color: #e8e8e8;}
    </style>
    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
    <script>

    $(function(){
        $("tr").click(function(){
            $(this).toggleClass('here')
            console.log($(this).text().trim())
        })
    })

    function testFunction(){
        $(".textArea").empty();
        let length = $(".here").length;
        $(".textArea").append($(".here").text().trim())
    }

    </script>
</head>
<body>
    <table border="1px solid black">
        <thead>
           <tr>
              <th scope="col"><a>이름</a></th>
            </tr>
        </thead>
        <tbody>
          <tr><td>철수</td></tr>
          <tr><td>영수</td></tr>
          <tr><td>토마스</td></tr>
          <tr><td>순이</td></tr>
          <tr><td>창모</td></tr>        
        </tbody>
        
        <hr/>
        <button class="test" onclick="testFunction()">결제자</button>
        <div class="textArea"></div>
    </table>
</body>
</html>