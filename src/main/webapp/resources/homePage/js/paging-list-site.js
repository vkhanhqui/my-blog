$("body").on("click", ".paging-items", function () {
    var startingPage = $(this).text();
    $.ajax({
        url: "/vkhanhqui_myblog_war/api/list",
        type: "GET",
        data: {
            startingPage: startingPage
        },
        success: function (value) {
            var paging = $("#paging-div1").find("#paging-div2");
            paging.empty();
            paging.append(value);
        }
    })
});