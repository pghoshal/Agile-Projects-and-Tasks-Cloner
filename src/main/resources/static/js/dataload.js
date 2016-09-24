function loadDataFromList () {
            form1 = document.form[0];
            var e=form1.sync-product-single-select;
            var project1 = e.options[e.selectedIndex].value;
            
            form2 = document.form[1];
            var e1=form2.sync-product-single-select;
            var project2 = e1.options[e1.selectedIndex].value;
            if(project1==project2){
            	alert('Please select different projects');
            	return false;
            }
            var func = [];
            
        }
        function loadAllDataFromList () {
            //Do search
        }