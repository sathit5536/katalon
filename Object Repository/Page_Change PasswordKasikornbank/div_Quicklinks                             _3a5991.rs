<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Quicklinks                             _3a5991</name>
   <tag></tag>
   <elementGuidId>5ad5e159-299e-4763-a366-3974548877f9</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='mainContainer']/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#mainContainer > div.center960</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>1c0cb47c-f50a-4885-bf0b-b3241e46443f</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>center960</value>
      <webElementGuid>c462a056-d9fe-42dc-86f4-5abebce43e26</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Change Password


	Change Mobile App Home Screen Photo


		            
		        
		        
		        
	        
	
			
	        
	        	








$(document).ready(function() {
	
	/* Fields Validation */
	addInputCheck('#currPass',regex_password,error_password);
	addInputCheck('#newPass',regex_password,error_password);
	addInputCheck_4('#retypePass','#newPass',error_misMatch);
	function validateInput1() {return successValidateField($(&quot;#currPass&quot;).val(),regex_password,&quot;#currPassError&quot;,error_password);}
	function validateInput2() {return successValidateField($(&quot;#newPass&quot;).val(),regex_password,&quot;#newPassError&quot;,error_password);}
	function validateInput3() {return notMatchPassword($(&quot;#retypePass&quot;).val(),$(&quot;#newPass&quot;).val(),&quot;#retypePassError&quot;,error_misMatch);}
	/* AJAX Options and Response */ 
	var countLogin = 0;
	function showResponse(responseText, statusText, xhr, $form)  { 
     	if(xhr.responseText==&quot;success&quot;){  
     		$('#changePassForm').unbind('submit');
     		$('#changePassForm').attr('action','doChangePassword');
     		$('#changePassForm').submit(); 
     	}else if(xhr.responseText!=&quot;success&quot;){     		
     		$('#changePassForm').unbind('submit');
     		errorItemArr=[];
     		errorItemArr=xhr.responseText.split(',');
     		for(var i=0;i&lt; errorItemArr.length;i++){
     			if(errorItemArr[i]==&quot;currPass&quot;){thisShowError('#currPassError', error_wrongPass);
     			countLogin++
     			}
     			if(errorItemArr[i]==&quot;newPass&quot;){thisShowError('#newPassError', error_chooseNew);}
    		}
     	}
     	if(countLogin == 3){ window.location = &quot;/auth/logout&quot;; }
    } 
	var options = { 
			success: showResponse,
		        url: 'checkPassword'
	};
	function toSubmit(opt){
		$('#changePassForm').submit(function() { 
	     	$(this).ajaxSubmit(opt);     
	     	return false;
		});
		$('#changePassForm').submit();       
	}   
	
	$('#submitForm').click(function(){
		var error = false;
		if(validateInput1() == false) error = true;
		if(validateInput2() == false) error = true;
		if(validateInput3() == false) error = true;

		if(error == false) {
			toSubmit(options);
	 	}else{ 
	 		return false;		
	 	}
	});
	
});




	Change Password

Please provide the information below. 



	
		
		
			Current Password
	       	
	         	
	         	Your Password should be at least 7 characters with a minimum one uppercase and one numeric
			
			New Password
	       	
	         	
	         	
			
			Retype Password
	       	
	         	
	         	
			
			
		
		
		
			Submit
			
		
		
	
            
            
                    
	        	
	    
            
		
        
        </value>
      <webElementGuid>7016818f-3c7e-4fd2-96d0-8ec1b6e4f26a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;mainContainer&quot;)/div[@class=&quot;center960&quot;]</value>
      <webElementGuid>f825c91b-f9d7-4e6c-a83f-b426ea81e626</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='mainContainer']/div</value>
      <webElementGuid>adb511a5-7f49-454f-b62b-42ba28b1e201</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Support'])[1]/following::div[3]</value>
      <webElementGuid>ecee87c3-7a0a-483b-886a-2064f3d39b66</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Settings'])[1]/following::div[3]</value>
      <webElementGuid>a90d1ccc-6287-4606-94fc-b837a72fc6fa</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[4]/div</value>
      <webElementGuid>3d4f0a9c-c824-4d97-98cd-ce72adf042c8</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Change Password


	Change Mobile App Home Screen Photo


		            
		        
		        
		        
	        
	
			
	        
	        	








$(document).ready(function() {
	
	/* Fields Validation */
	addInputCheck(&quot; , &quot;'&quot; , &quot;#currPass&quot; , &quot;'&quot; , &quot;,regex_password,error_password);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#newPass&quot; , &quot;'&quot; , &quot;,regex_password,error_password);
	addInputCheck_4(&quot; , &quot;'&quot; , &quot;#retypePass&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#newPass&quot; , &quot;'&quot; , &quot;,error_misMatch);
	function validateInput1() {return successValidateField($(&quot;#currPass&quot;).val(),regex_password,&quot;#currPassError&quot;,error_password);}
	function validateInput2() {return successValidateField($(&quot;#newPass&quot;).val(),regex_password,&quot;#newPassError&quot;,error_password);}
	function validateInput3() {return notMatchPassword($(&quot;#retypePass&quot;).val(),$(&quot;#newPass&quot;).val(),&quot;#retypePassError&quot;,error_misMatch);}
	/* AJAX Options and Response */ 
	var countLogin = 0;
	function showResponse(responseText, statusText, xhr, $form)  { 
     	if(xhr.responseText==&quot;success&quot;){  
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doChangePassword&quot; , &quot;'&quot; , &quot;);
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).submit(); 
     	}else if(xhr.responseText!=&quot;success&quot;){     		
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
     		errorItemArr=[];
     		errorItemArr=xhr.responseText.split(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;);
     		for(var i=0;i&lt; errorItemArr.length;i++){
     			if(errorItemArr[i]==&quot;currPass&quot;){thisShowError(&quot; , &quot;'&quot; , &quot;#currPassError&quot; , &quot;'&quot; , &quot;, error_wrongPass);
     			countLogin++
     			}
     			if(errorItemArr[i]==&quot;newPass&quot;){thisShowError(&quot; , &quot;'&quot; , &quot;#newPassError&quot; , &quot;'&quot; , &quot;, error_chooseNew);}
    		}
     	}
     	if(countLogin == 3){ window.location = &quot;/auth/logout&quot;; }
    } 
	var options = { 
			success: showResponse,
		        url: &quot; , &quot;'&quot; , &quot;checkPassword&quot; , &quot;'&quot; , &quot;
	};
	function toSubmit(opt){
		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).submit(function() { 
	     	$(this).ajaxSubmit(opt);     
	     	return false;
		});
		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).submit();       
	}   
	
	$(&quot; , &quot;'&quot; , &quot;#submitForm&quot; , &quot;'&quot; , &quot;).click(function(){
		var error = false;
		if(validateInput1() == false) error = true;
		if(validateInput2() == false) error = true;
		if(validateInput3() == false) error = true;

		if(error == false) {
			toSubmit(options);
	 	}else{ 
	 		return false;		
	 	}
	});
	
});




	Change Password

Please provide the information below. 



	
		
		
			Current Password
	       	
	         	
	         	Your Password should be at least 7 characters with a minimum one uppercase and one numeric
			
			New Password
	       	
	         	
	         	
			
			Retype Password
	       	
	         	
	         	
			
			
		
		
		
			Submit
			
		
		
	
            
            
                    
	        	
	    
            
		
        
        &quot;) or . = concat(&quot;
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Change Password


	Change Mobile App Home Screen Photo


		            
		        
		        
		        
	        
	
			
	        
	        	








$(document).ready(function() {
	
	/* Fields Validation */
	addInputCheck(&quot; , &quot;'&quot; , &quot;#currPass&quot; , &quot;'&quot; , &quot;,regex_password,error_password);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#newPass&quot; , &quot;'&quot; , &quot;,regex_password,error_password);
	addInputCheck_4(&quot; , &quot;'&quot; , &quot;#retypePass&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#newPass&quot; , &quot;'&quot; , &quot;,error_misMatch);
	function validateInput1() {return successValidateField($(&quot;#currPass&quot;).val(),regex_password,&quot;#currPassError&quot;,error_password);}
	function validateInput2() {return successValidateField($(&quot;#newPass&quot;).val(),regex_password,&quot;#newPassError&quot;,error_password);}
	function validateInput3() {return notMatchPassword($(&quot;#retypePass&quot;).val(),$(&quot;#newPass&quot;).val(),&quot;#retypePassError&quot;,error_misMatch);}
	/* AJAX Options and Response */ 
	var countLogin = 0;
	function showResponse(responseText, statusText, xhr, $form)  { 
     	if(xhr.responseText==&quot;success&quot;){  
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doChangePassword&quot; , &quot;'&quot; , &quot;);
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).submit(); 
     	}else if(xhr.responseText!=&quot;success&quot;){     		
     		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
     		errorItemArr=[];
     		errorItemArr=xhr.responseText.split(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;);
     		for(var i=0;i&lt; errorItemArr.length;i++){
     			if(errorItemArr[i]==&quot;currPass&quot;){thisShowError(&quot; , &quot;'&quot; , &quot;#currPassError&quot; , &quot;'&quot; , &quot;, error_wrongPass);
     			countLogin++
     			}
     			if(errorItemArr[i]==&quot;newPass&quot;){thisShowError(&quot; , &quot;'&quot; , &quot;#newPassError&quot; , &quot;'&quot; , &quot;, error_chooseNew);}
    		}
     	}
     	if(countLogin == 3){ window.location = &quot;/auth/logout&quot;; }
    } 
	var options = { 
			success: showResponse,
		        url: &quot; , &quot;'&quot; , &quot;checkPassword&quot; , &quot;'&quot; , &quot;
	};
	function toSubmit(opt){
		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).submit(function() { 
	     	$(this).ajaxSubmit(opt);     
	     	return false;
		});
		$(&quot; , &quot;'&quot; , &quot;#changePassForm&quot; , &quot;'&quot; , &quot;).submit();       
	}   
	
	$(&quot; , &quot;'&quot; , &quot;#submitForm&quot; , &quot;'&quot; , &quot;).click(function(){
		var error = false;
		if(validateInput1() == false) error = true;
		if(validateInput2() == false) error = true;
		if(validateInput3() == false) error = true;

		if(error == false) {
			toSubmit(options);
	 	}else{ 
	 		return false;		
	 	}
	});
	
});




	Change Password

Please provide the information below. 



	
		
		
			Current Password
	       	
	         	
	         	Your Password should be at least 7 characters with a minimum one uppercase and one numeric
			
			New Password
	       	
	         	
	         	
			
			Retype Password
	       	
	         	
	         	
			
			
		
		
		
			Submit
			
		
		
	
            
            
                    
	        	
	    
            
		
        
        &quot;))]</value>
      <webElementGuid>ca393be1-0f30-4bd4-a34d-978589b5d519</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
