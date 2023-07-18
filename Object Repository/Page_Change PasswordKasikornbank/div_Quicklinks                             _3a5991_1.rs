<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Quicklinks                             _3a5991_1</name>
   <tag></tag>
   <elementGuidId>86753906-91e2-4818-8c07-23103908b85a</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='mainContainer']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#mainContainer</value>
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
      <webElementGuid>0873a4b3-9570-401a-b56c-32bed20e78d1</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>mainContainer</value>
      <webElementGuid>83070b17-22b5-408a-bbce-9c9c5ba17047</webElementGuid>
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
	       	
	         	
	         	
			
			New Password
	       	
	         	
	         	
			
			Retype Password
	       	
	         	
	         	
			
			
		
		
		
			Submit
			
		
		
	
            
            
                    
	        	
	    
            
		
        
        
    </value>
      <webElementGuid>d12ea081-10ed-47fb-96ec-6386d4c3bd39</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;mainContainer&quot;)</value>
      <webElementGuid>f02e814f-0083-4094-8507-6a7a2c1e84de</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='mainContainer']</value>
      <webElementGuid>7443666c-8e5c-4dd6-bbe2-35129a6e6436</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='topContainer']/div[4]</value>
      <webElementGuid>46b7ea57-a0d8-4770-84fb-ecd7221daa39</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Support'])[1]/following::div[2]</value>
      <webElementGuid>3a58001d-4867-4428-8a57-f92cd581bfdd</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Settings'])[1]/following::div[2]</value>
      <webElementGuid>0fcddd77-3078-47bb-9588-98fa1ce0e591</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[4]</value>
      <webElementGuid>47a21c43-c40e-4b7c-855c-ebff6b01f326</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'mainContainer' and (text() = concat(&quot;
        
    
	    
	    	
			    
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
	       	
	         	
	         	
			
			New Password
	       	
	         	
	         	
			
			Retype Password
	       	
	         	
	         	
			
			
		
		
		
			Submit
			
		
		
	
            
            
                    
	        	
	    
            
		
        
        
    &quot;))]</value>
      <webElementGuid>682f2f08-b13e-4738-8a8c-a07150d42fb7</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
