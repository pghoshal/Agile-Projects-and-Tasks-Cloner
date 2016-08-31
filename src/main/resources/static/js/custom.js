$(document).ready(function() {
$("button#jQueryColorChange").on('click',function(){
    $(this).toggleClass('selected');
});

AJS.$(".dialog-show-button-custom").click(function() {
    AJS.dialog2("#demo-dialog").show();
});

AJS.$("#dialog-close-button").click(function(e) {
    e.preventDefault();
    AJS.dialog2("#demo-dialog").hide();
});
});


