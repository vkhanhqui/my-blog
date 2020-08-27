

$("body").on("click",".paging-items",function(){
    // var pageNumber= $(this).text();
    // var startingPage= (pageNumber -1)*9;
    var startingPage=$(this).text();
    alert(startingPage);
    $.ajax({
        url:"/vkhanhqui_myblog_war/api/list",
        type:"GET",
        data:{
            startingPage:startingPage
        },
        processData: false,
        contentType: false,
        cache: false,
        timeout: 1000000,
        success: function(value){
            var paging= $("#content").find("#paging");
            paging.empty();
            paging.append(value);
        }
    })
});