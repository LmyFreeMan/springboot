function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}
var current=1;
if(getUrlParam("pageNo")!=null)
    current=getUrlParam("pageNo")
$('#pageLimit').bootstrapPaginator({
    currentPage: current,//当前的请求页面。
    totalPages: $("#totalPages").html(),//一共多少页。
    size:"normal",//应该是页眉的大小。
    bootstrapMajorVersion: 3,//bootstrap的版本要求。
    alignment:"right",
    numberOfPages:$("PageSize").html(),//一页列出多少数据。
    itemTexts: function (type, page, current) {//如下的代码是将页眉显示的中文显示我们自定义的中文。

        switch (type) {
            case "first": return "首页";
            case "prev": return "上一页";
            case "next": return "下一页";
            case "last": return "末页";
            case "page": return page;
        }
    },
    onPageClicked:function (event, originalEvent, type, page) {
        console.log(page)
        window.location.href="/emps?pageNo="+page
    }

});