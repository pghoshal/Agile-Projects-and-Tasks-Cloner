$(document).ready(function() {
	$("#progress-bar").hide();
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
var task=null;
var story=null;
var request=null;
var bug=null;
var subtask=null;
var boolTask=false;
var boolStory=false;
var boolRequest=false;
var boolBug=false;
var boolSubtask=false;
$("#dialog-show-button-1").on('click',function(){
	$(this).toggleClass('selected');
	if(!boolTask){
		task = $("#dialog-show-button-1").val();
		boolTask=true;
	}else{
		task=null;
		boolTask=false;
		
	}
});
$("#dialog-show-button-2").on('click',function(){
	$(this).toggleClass('selected');
	if(!boolStory){
		story = $(this).val();
		boolStory=true;
	} else {
		story=null;
		boolStory=false;
	}
});
$("#dialog-show-button-3").on('click',function(){
	$(this).toggleClass('selected');
	if(!boolRequest){
		request = $(this).val();
		boolRequest=true;
	} else {
		request=null;
		boolRequest=false;
	}
});
$("#dialog-show-button-4").on('click',function(){
	$(this).toggleClass('selected');
    if(!boolBug){
    	bug = $(this).val();
    	boolBug=true;
	} else {
		bug=null;
		boolBug=false;
	}
});
$("#dialog-show-button-5").on('click',function(){
	$(this).toggleClass('selected');
	if(!boolSubtask){
			subtask = $(this).val();
			boolSubtask=true;
		} else {
			subtask=null;
			boolSubtask=false;
		}
});
$("#load-custom-button").on('click' ,function(){
	var  dd1 = $("#sync-product-single-select-1").val();
	var  dd2 = $("#sync-product-single-select-2").val();
	if(dd1==''){
		alert('Please select From Project to copy')
	}else if(dd2==''){
		alert('Please select To Project');
	}else if(dd1==dd2){
		alert('Please select different projects to copy');
	}else if(dd2=='' && dd1==''){
		alert('Please select Projects to proceed');
	} else {
		$("#progress-bar").show();
        if (AJS.$("#progress-bar").attr("data-value")) {
            AJS.progressBars.setIndeterminate("#progress-bar");
        } 
        var baseUrl= $('input#baseUrl').val()
		// alert(task+ ' & '+ story + ' & '+request+' & '+bug+' & '+ subtask);
		$.ajax({
		    url: '/copyissues',
		    dataType: 'json',
		    type: 'post',
		    contentType: 'application/json',
		    data: JSON.stringify( { "projectA":dd1 , "projectB": dd2, "baseUrl" :baseUrl, "issues" :[task, story, request, bug, subtask] } ),
		    processData: false,
		    success: function( data, textStatus, jQxhr ){
		        AJS.progressBars.update("#progress-bar", 1);
		        $("#progress-bar").hide();
		        AJS.flag({
		            type: 'info',
		            title: 'Issues have been created.',
		            body: '<ul class="aui-nav-actions-list">' +
		                '<li><a href="#">View issue</a></li>' +
		                '<li><a href="#">Add to sprint</a></li>' +
		            '</ul>'
		        });
		    },
		    error: function( jqXhr, textStatus, errorThrown ){
		        console.log( errorThrown );
		        $("#progress-bar").hide();
		        AJS.flag({
		            type: 'error',
		            title: 'Error during issue copy.',
		            body: '<ul class="aui-nav-actions-list">' +
		                '<li><a href="#">View issue</a></li>' +
		                '<li><a href="#">Add to sprint</a></li>' +
		            '</ul>'
		        });
		    }
		});
	}
	
});

});


