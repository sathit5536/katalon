<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Quicklinks                             _cc13b1</name>
   <tag></tag>
   <elementGuidId>d263a447-ca74-4f35-83ca-8917272358fc</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#mainContainer</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='mainContainer']</value>
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
      <webElementGuid>7d0270d9-be66-4863-a6f2-f6c370e2f39d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>mainContainer</value>
      <webElementGuid>79f54c01-1f83-422b-8113-4bd64dfc682b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            

	Company User Summary



	Add a Company User


		            
		        
		        
		        
	        
	
			
	        
	        	



 
	$(document).ready(function() {
		// hint text
		var hint_contact_mobile = &quot;08X1234567&quot;;
		var hint_email = &quot;john.doe@gmail.com&quot;;
		// enforce input checkings
		addInputCheck('#name',regex_name,error_name);
		addInputCheck('#contact',regex_contact_mobile,error_contact);
		addInputCheck('#email',regex_email,error_email);
		
		var dupItemArr;
		function validateInput2(){			  
			return successValidateField($(&quot;#name&quot;).val(),regex_name,&quot;#nameError&quot;,error_name);
		}
		function validateInput3_1(){			 	
			return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		}
		function validateInput4(){			  
			return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),&quot;john.doe@gmail.com&quot;,&quot;#emailError&quot;,error_email);			  		
		}
		 
	    function showResponse(responseText, statusText, xhr, $form)  { 
	    	// bind back the click event
	    	$('.next').click(function(){
	    		goNext($(this));
	    	});
	    	if(xhr.responseText==&quot;success&quot;){
	     		nextPage(1);
	     		$('#customForm').unbind('submit');
	     	}else if(xhr.responseText!=&quot;success&quot;){     		
	     		$('#customForm').unbind('submit');     		
	     		dupItemArr=[];
	     		dupItemArr=xhr.responseText.split(',');
	     		showDuplicateError();
	     	}
	    } 
	    
	    var options = { 
	        success:showResponse,
	        url:'checkItemsAvailability'
	    }; 
	    
	    function toSubmit(opt){
	        $('#customForm').submit(function() { 
	        	$(this).ajaxSubmit(opt);     
	            return false; 
	        });
	        $('#customForm').submit();       
	    }   
	
		function showDuplicateError(){
			hideAllDuplicateErrors();
			for(var i=0;i&lt; dupItemArr.length;i++){			
				thisShowError(&quot;#&quot;+dupItemArr[i]+&quot;Error&quot;, &quot;Duplicated. Not Available&quot;);
			}
			$('#scrollBox').css('height', $('#step1').height());
		}	
		
		function hideAllDuplicateErrors(){			
			thisHideError(&quot;#contactError&quot;);
			thisHideError(&quot;#emailError&quot;);
		}
		
		$('.next').click(function(){
			goNext($(this));
		});
		
		$('.prev').click(function(){
			prevPage($(this).attr('id'));		
		});
		
		function goNext(thisClick){
			if($(thisClick).attr('id')==1){
				var error = false;
				if(validateInput2() == false) {
					error = true;
				}
				if(validateInput3_1() == false) {
					error = true;
				}
				if(validateInput4() == false) {
					error = true;
				}
				if(error == false) {
// 					$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
			 		$(&quot;#namePass&quot;).html($(&quot;#name&quot;).val());
			 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
			 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
			 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
			 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
			 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
			 		$(&quot;#rolePass&quot;).html($(&quot;#role&quot;).val());
				} else { 
				 	$('#scrollBox').css('height', $('#step1').height());
				 	return false;
				}
				toSubmit(options);
				$(thisClick).unbind('click');
			}			
		}
		
		$(&quot;#submitThis&quot;).click(function() {
			$('#customForm').attr('action','doRegister');
		 	$('#customForm').submit(); 
		});
		
		/* Quick Fix */
		$(&quot;input&quot;).focus(function(){
			$('#step2').css('display', 'none');
			$('#scroll').css('width', 736);
		});			
		$(&quot;input&quot;).blur(function(){
			$('#scroll').removeAttr(&quot;style&quot;);
			$('#step2').removeAttr(&quot;style&quot;);
		});
	}); 

 



		
			
			
			
				Add a Company User
			
		
			
			
				
					
			          	 
			          	Details
			          	 
			           	Review &amp; Confirm
			          	 
			          	Complete
					
					
				
			
		
			
			
		    		
					
					
						
							
							
				                
				                Company User Details
				                



				                
				                Name
				                
				                    
				                    (Between 5-20 Alphabets, spaces and/or dashes(-))
				                    
				                
				                
				                Contact No.
			                	
			                		
			                		if (document.getElementById('contact').value != '08X1234567') document.getElementById('contact').style.color = '#333333';
			                		
			                		
			                		(For mobile activation code)
			                		
			                	
				                
				                Email Address
			                	
			                		
			                    	if (document.getElementById('email').value != 'john.doe@gmail.com') document.getElementById('email').style.color = '#333333';
			                		(For email notifications)
			                		Please enter valid Email
			                	
				                
				                Role
			                	
			                		Staff Admin							
										
											Staff Admin
										
											Accounting Admin
										
											Viewer
											
									
			                	
				                
							
							
							
						   		Submit
								
							
							
						
					
					
					
						
							
							
								
								Company User Details
				                
				                
				                Name
			                	
				                
				                Contact No.
			                	
				                
				                Email Address
			                	
				                
				                Role
			                	
				                
				              

							
							
							
						    	Back  
						   		Confirm
								
							
							
						
					
				
				
			
			
			
		
	
	        	
	    
            
		
        
        
    </value>
      <webElementGuid>d50bbe5a-fdda-4d32-b0b4-30f12e00dfba</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;mainContainer&quot;)</value>
      <webElementGuid>269a4c2c-2d0a-443d-a2a3-9e0ef43372cb</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='mainContainer']</value>
      <webElementGuid>83c6dcf0-7bdc-4d71-be12-69253e8c81c7</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='topContainer']/div[4]</value>
      <webElementGuid>989196f3-b690-4216-bf4b-d531391df3a9</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Support'])[1]/following::div[2]</value>
      <webElementGuid>361df9df-57bd-4527-8447-1fb01e2aa373</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Settings'])[1]/following::div[2]</value>
      <webElementGuid>a107d05f-c7e2-4725-aa57-f573fd29326b</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[4]</value>
      <webElementGuid>a06a4ecd-2e06-400f-8273-14530bb53684</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'mainContainer' and (text() = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            

	Company User Summary



	Add a Company User


		            
		        
		        
		        
	        
	
			
	        
	        	



 
	$(document).ready(function() {
		// hint text
		var hint_contact_mobile = &quot;08X1234567&quot;;
		var hint_email = &quot;john.doe@gmail.com&quot;;
		// enforce input checkings
		addInputCheck(&quot; , &quot;'&quot; , &quot;#name&quot; , &quot;'&quot; , &quot;,regex_name,error_name);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#contact&quot; , &quot;'&quot; , &quot;,regex_contact_mobile,error_contact);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#email&quot; , &quot;'&quot; , &quot;,regex_email,error_email);
		
		var dupItemArr;
		function validateInput2(){			  
			return successValidateField($(&quot;#name&quot;).val(),regex_name,&quot;#nameError&quot;,error_name);
		}
		function validateInput3_1(){			 	
			return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		}
		function validateInput4(){			  
			return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),&quot;john.doe@gmail.com&quot;,&quot;#emailError&quot;,error_email);			  		
		}
		 
	    function showResponse(responseText, statusText, xhr, $form)  { 
	    	// bind back the click event
	    	$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
	    		goNext($(this));
	    	});
	    	if(xhr.responseText==&quot;success&quot;){
	     		nextPage(1);
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
	     	}else if(xhr.responseText!=&quot;success&quot;){     		
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);     		
	     		dupItemArr=[];
	     		dupItemArr=xhr.responseText.split(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;);
	     		showDuplicateError();
	     	}
	    } 
	    
	    var options = { 
	        success:showResponse,
	        url:&quot; , &quot;'&quot; , &quot;checkItemsAvailability&quot; , &quot;'&quot; , &quot;
	    }; 
	    
	    function toSubmit(opt){
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(function() { 
	        	$(this).ajaxSubmit(opt);     
	            return false; 
	        });
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit();       
	    }   
	
		function showDuplicateError(){
			hideAllDuplicateErrors();
			for(var i=0;i&lt; dupItemArr.length;i++){			
				thisShowError(&quot;#&quot;+dupItemArr[i]+&quot;Error&quot;, &quot;Duplicated. Not Available&quot;);
			}
			$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
		}	
		
		function hideAllDuplicateErrors(){			
			thisHideError(&quot;#contactError&quot;);
			thisHideError(&quot;#emailError&quot;);
		}
		
		$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
			goNext($(this));
		});
		
		$(&quot; , &quot;'&quot; , &quot;.prev&quot; , &quot;'&quot; , &quot;).click(function(){
			prevPage($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));		
		});
		
		function goNext(thisClick){
			if($(thisClick).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)==1){
				var error = false;
				if(validateInput2() == false) {
					error = true;
				}
				if(validateInput3_1() == false) {
					error = true;
				}
				if(validateInput4() == false) {
					error = true;
				}
				if(error == false) {
// 					$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
			 		$(&quot;#namePass&quot;).html($(&quot;#name&quot;).val());
			 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
			 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
			 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
			 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
			 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
			 		$(&quot;#rolePass&quot;).html($(&quot;#role&quot;).val());
				} else { 
				 	$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
				 	return false;
				}
				toSubmit(options);
				$(thisClick).unbind(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;);
			}			
		}
		
		$(&quot;#submitThis&quot;).click(function() {
			$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doRegister&quot; , &quot;'&quot; , &quot;);
		 	$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(); 
		});
		
		/* Quick Fix */
		$(&quot;input&quot;).focus(function(){
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;);
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;width&quot; , &quot;'&quot; , &quot;, 736);
		});			
		$(&quot;input&quot;).blur(function(){
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
		});
	}); 

 



		
			
			
			
				Add a Company User
			
		
			
			
				
					
			          	 
			          	Details
			          	 
			           	Review &amp; Confirm
			          	 
			          	Complete
					
					
				
			
		
			
			
		    		
					
					
						
							
							
				                
				                Company User Details
				                



				                
				                Name
				                
				                    
				                    (Between 5-20 Alphabets, spaces and/or dashes(-))
				                    
				                
				                
				                Contact No.
			                	
			                		
			                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;08X1234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		
			                		
			                		(For mobile activation code)
			                		
			                	
				                
				                Email Address
			                	
			                		
			                    	if (document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;john.doe@gmail.com&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		(For email notifications)
			                		Please enter valid Email
			                	
				                
				                Role
			                	
			                		Staff Admin							
										
											Staff Admin
										
											Accounting Admin
										
											Viewer
											
									
			                	
				                
							
							
							
						   		Submit
								
							
							
						
					
					
					
						
							
							
								
								Company User Details
				                
				                
				                Name
			                	
				                
				                Contact No.
			                	
				                
				                Email Address
			                	
				                
				                Role
			                	
				                
				              

							
							
							
						    	Back  
						   		Confirm
								
							
							
						
					
				
				
			
			
			
		
	
	        	
	    
            
		
        
        
    &quot;) or . = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            

	Company User Summary



	Add a Company User


		            
		        
		        
		        
	        
	
			
	        
	        	



 
	$(document).ready(function() {
		// hint text
		var hint_contact_mobile = &quot;08X1234567&quot;;
		var hint_email = &quot;john.doe@gmail.com&quot;;
		// enforce input checkings
		addInputCheck(&quot; , &quot;'&quot; , &quot;#name&quot; , &quot;'&quot; , &quot;,regex_name,error_name);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#contact&quot; , &quot;'&quot; , &quot;,regex_contact_mobile,error_contact);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#email&quot; , &quot;'&quot; , &quot;,regex_email,error_email);
		
		var dupItemArr;
		function validateInput2(){			  
			return successValidateField($(&quot;#name&quot;).val(),regex_name,&quot;#nameError&quot;,error_name);
		}
		function validateInput3_1(){			 	
			return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		}
		function validateInput4(){			  
			return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),&quot;john.doe@gmail.com&quot;,&quot;#emailError&quot;,error_email);			  		
		}
		 
	    function showResponse(responseText, statusText, xhr, $form)  { 
	    	// bind back the click event
	    	$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
	    		goNext($(this));
	    	});
	    	if(xhr.responseText==&quot;success&quot;){
	     		nextPage(1);
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
	     	}else if(xhr.responseText!=&quot;success&quot;){     		
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);     		
	     		dupItemArr=[];
	     		dupItemArr=xhr.responseText.split(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;);
	     		showDuplicateError();
	     	}
	    } 
	    
	    var options = { 
	        success:showResponse,
	        url:&quot; , &quot;'&quot; , &quot;checkItemsAvailability&quot; , &quot;'&quot; , &quot;
	    }; 
	    
	    function toSubmit(opt){
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(function() { 
	        	$(this).ajaxSubmit(opt);     
	            return false; 
	        });
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit();       
	    }   
	
		function showDuplicateError(){
			hideAllDuplicateErrors();
			for(var i=0;i&lt; dupItemArr.length;i++){			
				thisShowError(&quot;#&quot;+dupItemArr[i]+&quot;Error&quot;, &quot;Duplicated. Not Available&quot;);
			}
			$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
		}	
		
		function hideAllDuplicateErrors(){			
			thisHideError(&quot;#contactError&quot;);
			thisHideError(&quot;#emailError&quot;);
		}
		
		$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
			goNext($(this));
		});
		
		$(&quot; , &quot;'&quot; , &quot;.prev&quot; , &quot;'&quot; , &quot;).click(function(){
			prevPage($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));		
		});
		
		function goNext(thisClick){
			if($(thisClick).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)==1){
				var error = false;
				if(validateInput2() == false) {
					error = true;
				}
				if(validateInput3_1() == false) {
					error = true;
				}
				if(validateInput4() == false) {
					error = true;
				}
				if(error == false) {
// 					$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
			 		$(&quot;#namePass&quot;).html($(&quot;#name&quot;).val());
			 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
			 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
			 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
			 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
			 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
			 		$(&quot;#rolePass&quot;).html($(&quot;#role&quot;).val());
				} else { 
				 	$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
				 	return false;
				}
				toSubmit(options);
				$(thisClick).unbind(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;);
			}			
		}
		
		$(&quot;#submitThis&quot;).click(function() {
			$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doRegister&quot; , &quot;'&quot; , &quot;);
		 	$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(); 
		});
		
		/* Quick Fix */
		$(&quot;input&quot;).focus(function(){
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;);
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;width&quot; , &quot;'&quot; , &quot;, 736);
		});			
		$(&quot;input&quot;).blur(function(){
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
		});
	}); 

 



		
			
			
			
				Add a Company User
			
		
			
			
				
					
			          	 
			          	Details
			          	 
			           	Review &amp; Confirm
			          	 
			          	Complete
					
					
				
			
		
			
			
		    		
					
					
						
							
							
				                
				                Company User Details
				                



				                
				                Name
				                
				                    
				                    (Between 5-20 Alphabets, spaces and/or dashes(-))
				                    
				                
				                
				                Contact No.
			                	
			                		
			                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;08X1234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		
			                		
			                		(For mobile activation code)
			                		
			                	
				                
				                Email Address
			                	
			                		
			                    	if (document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;john.doe@gmail.com&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		(For email notifications)
			                		Please enter valid Email
			                	
				                
				                Role
			                	
			                		Staff Admin							
										
											Staff Admin
										
											Accounting Admin
										
											Viewer
											
									
			                	
				                
							
							
							
						   		Submit
								
							
							
						
					
					
					
						
							
							
								
								Company User Details
				                
				                
				                Name
			                	
				                
				                Contact No.
			                	
				                
				                Email Address
			                	
				                
				                Role
			                	
				                
				              

							
							
							
						    	Back  
						   		Confirm
								
							
							
						
					
				
				
			
			
			
		
	
	        	
	    
            
		
        
        
    &quot;))]</value>
      <webElementGuid>fb039f3d-8897-4b71-8a4f-790329b21a05</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'mainContainer' and (text() = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            

	Company User Summary



	Add a Company User


		            
		        
		        
		        
	        
	
			
	        
	        	



 
	$(document).ready(function() {
		// hint text
		var hint_contact_mobile = &quot;08X1234567&quot;;
		var hint_email = &quot;john.doe@gmail.com&quot;;
		// enforce input checkings
		addInputCheck(&quot; , &quot;'&quot; , &quot;#name&quot; , &quot;'&quot; , &quot;,regex_name,error_name);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#contact&quot; , &quot;'&quot; , &quot;,regex_contact_mobile,error_contact);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#email&quot; , &quot;'&quot; , &quot;,regex_email,error_email);
		
		var dupItemArr;
		function validateInput2(){			  
			return successValidateField($(&quot;#name&quot;).val(),regex_name,&quot;#nameError&quot;,error_name);
		}
		function validateInput3_1(){			 	
			return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		}
		function validateInput4(){			  
			return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),&quot;john.doe@gmail.com&quot;,&quot;#emailError&quot;,error_email);			  		
		}
		 
	    function showResponse(responseText, statusText, xhr, $form)  { 
	    	// bind back the click event
	    	$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
	    		goNext($(this));
	    	});
	    	if(xhr.responseText==&quot;success&quot;){
	     		nextPage(1);
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
	     	}else if(xhr.responseText!=&quot;success&quot;){     		
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);     		
	     		dupItemArr=[];
	     		dupItemArr=xhr.responseText.split(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;);
	     		showDuplicateError();
	     	}
	    } 
	    
	    var options = { 
	        success:showResponse,
	        url:&quot; , &quot;'&quot; , &quot;checkItemsAvailability&quot; , &quot;'&quot; , &quot;
	    }; 
	    
	    function toSubmit(opt){
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(function() { 
	        	$(this).ajaxSubmit(opt);     
	            return false; 
	        });
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit();       
	    }   
	
		function showDuplicateError(){
			hideAllDuplicateErrors();
			for(var i=0;i&lt; dupItemArr.length;i++){			
				thisShowError(&quot;#&quot;+dupItemArr[i]+&quot;Error&quot;, &quot;Duplicated. Not Available&quot;);
			}
			$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
		}	
		
		function hideAllDuplicateErrors(){			
			thisHideError(&quot;#contactError&quot;);
			thisHideError(&quot;#emailError&quot;);
		}
		
		$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
			goNext($(this));
		});
		
		$(&quot; , &quot;'&quot; , &quot;.prev&quot; , &quot;'&quot; , &quot;).click(function(){
			prevPage($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));		
		});
		
		function goNext(thisClick){
			if($(thisClick).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)==1){
				var error = false;
				if(validateInput2() == false) {
					error = true;
				}
				if(validateInput3_1() == false) {
					error = true;
				}
				if(validateInput4() == false) {
					error = true;
				}
				if(error == false) {
// 					$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
			 		$(&quot;#namePass&quot;).html($(&quot;#name&quot;).val());
			 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
			 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
			 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
			 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
			 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
			 		$(&quot;#rolePass&quot;).html($(&quot;#role&quot;).val());
				} else { 
				 	$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
				 	return false;
				}
				toSubmit(options);
				$(thisClick).unbind(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;);
			}			
		}
		
		$(&quot;#submitThis&quot;).click(function() {
			$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doRegister&quot; , &quot;'&quot; , &quot;);
		 	$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(); 
		});
		
		/* Quick Fix */
		$(&quot;input&quot;).focus(function(){
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;);
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;width&quot; , &quot;'&quot; , &quot;, 736);
		});			
		$(&quot;input&quot;).blur(function(){
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
		});
	}); 

 



		
			
			
			
				Add a Company User
			
		
			
			
				
					
			          	 
			          	Details
			          	 
			           	Review &amp; Confirm
			          	 
			          	Complete
					
					
				
			
		
			
			
		    		
					
					
						
							
							
				                
				                Company User Details
				                



				                
				                Name
				                
				                    
				                    (Between 5-20 Alphabets, spaces and/or dashes(-))
				                    
				                
				                
				                Contact No.
			                	
			                		
			                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;08X1234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		
			                		
			                		(For mobile activation code)
			                		
			                	
				                
				                Email Address
			                	
			                		
			                    	if (document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;john.doe@gmail.com&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		(For email notifications)
			                		
			                	
				                
				                Role
			                	
			                		Staff Admin							
										
											Staff Admin
										
											Accounting Admin
										
											Viewer
											
									
			                	
				                
							
							
							
						   		Submit
								
							
							
						
					
					
					
						
							
							
								
								Company User Details
				                
				                
				                Name
			                	
				                
				                Contact No.
			                	
				                
				                Email Address
			                	
				                
				                Role
			                	
				                
				              

							
							
							
						    	Back  
						   		Confirm
								
							
							
						
					
				
				
			
			
			
		
	
	        	
	    
            
		
        
        
    &quot;) or . = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            

	Company User Summary



	Add a Company User


		            
		        
		        
		        
	        
	
			
	        
	        	



 
	$(document).ready(function() {
		// hint text
		var hint_contact_mobile = &quot;08X1234567&quot;;
		var hint_email = &quot;john.doe@gmail.com&quot;;
		// enforce input checkings
		addInputCheck(&quot; , &quot;'&quot; , &quot;#name&quot; , &quot;'&quot; , &quot;,regex_name,error_name);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#contact&quot; , &quot;'&quot; , &quot;,regex_contact_mobile,error_contact);
		addInputCheck(&quot; , &quot;'&quot; , &quot;#email&quot; , &quot;'&quot; , &quot;,regex_email,error_email);
		
		var dupItemArr;
		function validateInput2(){			  
			return successValidateField($(&quot;#name&quot;).val(),regex_name,&quot;#nameError&quot;,error_name);
		}
		function validateInput3_1(){			 	
			return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		}
		function validateInput4(){			  
			return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),&quot;john.doe@gmail.com&quot;,&quot;#emailError&quot;,error_email);			  		
		}
		 
	    function showResponse(responseText, statusText, xhr, $form)  { 
	    	// bind back the click event
	    	$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
	    		goNext($(this));
	    	});
	    	if(xhr.responseText==&quot;success&quot;){
	     		nextPage(1);
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);
	     	}else if(xhr.responseText!=&quot;success&quot;){     		
	     		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).unbind(&quot; , &quot;'&quot; , &quot;submit&quot; , &quot;'&quot; , &quot;);     		
	     		dupItemArr=[];
	     		dupItemArr=xhr.responseText.split(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;);
	     		showDuplicateError();
	     	}
	    } 
	    
	    var options = { 
	        success:showResponse,
	        url:&quot; , &quot;'&quot; , &quot;checkItemsAvailability&quot; , &quot;'&quot; , &quot;
	    }; 
	    
	    function toSubmit(opt){
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(function() { 
	        	$(this).ajaxSubmit(opt);     
	            return false; 
	        });
	        $(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit();       
	    }   
	
		function showDuplicateError(){
			hideAllDuplicateErrors();
			for(var i=0;i&lt; dupItemArr.length;i++){			
				thisShowError(&quot;#&quot;+dupItemArr[i]+&quot;Error&quot;, &quot;Duplicated. Not Available&quot;);
			}
			$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
		}	
		
		function hideAllDuplicateErrors(){			
			thisHideError(&quot;#contactError&quot;);
			thisHideError(&quot;#emailError&quot;);
		}
		
		$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
			goNext($(this));
		});
		
		$(&quot; , &quot;'&quot; , &quot;.prev&quot; , &quot;'&quot; , &quot;).click(function(){
			prevPage($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));		
		});
		
		function goNext(thisClick){
			if($(thisClick).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)==1){
				var error = false;
				if(validateInput2() == false) {
					error = true;
				}
				if(validateInput3_1() == false) {
					error = true;
				}
				if(validateInput4() == false) {
					error = true;
				}
				if(error == false) {
// 					$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
			 		$(&quot;#namePass&quot;).html($(&quot;#name&quot;).val());
			 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
			 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
			 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
			 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
			 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
			 		$(&quot;#rolePass&quot;).html($(&quot;#role&quot;).val());
				} else { 
				 	$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
				 	return false;
				}
				toSubmit(options);
				$(thisClick).unbind(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;);
			}			
		}
		
		$(&quot;#submitThis&quot;).click(function() {
			$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doRegister&quot; , &quot;'&quot; , &quot;);
		 	$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(); 
		});
		
		/* Quick Fix */
		$(&quot;input&quot;).focus(function(){
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;);
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;width&quot; , &quot;'&quot; , &quot;, 736);
		});			
		$(&quot;input&quot;).blur(function(){
			$(&quot; , &quot;'&quot; , &quot;#scroll&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
			$(&quot; , &quot;'&quot; , &quot;#step2&quot; , &quot;'&quot; , &quot;).removeAttr(&quot;style&quot;);
		});
	}); 

 



		
			
			
			
				Add a Company User
			
		
			
			
				
					
			          	 
			          	Details
			          	 
			           	Review &amp; Confirm
			          	 
			          	Complete
					
					
				
			
		
			
			
		    		
					
					
						
							
							
				                
				                Company User Details
				                



				                
				                Name
				                
				                    
				                    (Between 5-20 Alphabets, spaces and/or dashes(-))
				                    
				                
				                
				                Contact No.
			                	
			                		
			                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;08X1234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		
			                		
			                		(For mobile activation code)
			                		
			                	
				                
				                Email Address
			                	
			                		
			                    	if (document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;john.doe@gmail.com&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
			                		(For email notifications)
			                		
			                	
				                
				                Role
			                	
			                		Staff Admin							
										
											Staff Admin
										
											Accounting Admin
										
											Viewer
											
									
			                	
				                
							
							
							
						   		Submit
								
							
							
						
					
					
					
						
							
							
								
								Company User Details
				                
				                
				                Name
			                	
				                
				                Contact No.
			                	
				                
				                Email Address
			                	
				                
				                Role
			                	
				                
				              

							
							
							
						    	Back  
						   		Confirm
								
							
							
						
					
				
				
			
			
			
		
	
	        	
	    
            
		
        
        
    &quot;))]</value>
      <webElementGuid>64c4b378-101c-40d3-9084-dea671392f14</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
