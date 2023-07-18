<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Quicklinks                             _0bc80a</name>
   <tag></tag>
   <elementGuidId>8691bae0-feb4-429e-ad40-666ec6458e4f</elementGuidId>
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
      <webElementGuid>69a78380-91e3-4cb5-b87e-a122789553be</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>mainContainer</value>
      <webElementGuid>1e77d8ab-d9ef-4f86-bc31-9ded093e84a5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Company Summary



	Add a Company




	K SHOP Company Summary


		            
		        
		        
		        
	        
	
			
	        
	        	





 
$(document).ready(function() {
	// hint text
	var hint_contact = &quot;021234567&quot;;
	var hint_contact_mobile = &quot;08X1234567&quot;;
	var hint_email = &quot;john.doe@gmail.com&quot;;
	
	var totalCompanyUser = 1;
	function addCompanyUserLimitCheck(id,regex,errorMsg,errorLimitMsg,totalCompanyUser) {
		$(id).change(function() {
			// remove leading and trailing spaces
			$(this).val($.trim($(this).val()));
			// get text
			var text = $(this).val();
			// validate
			var formatInvalid = invalidFormat(text, regex);
			var exceedInvalid = parseInt(text) &lt; totalCompanyUser;
			if(formatInvalid == true) {
				thisShowError(id + 'Error', errorMsg);
			} else if(exceedInvalid == true) {
				thisShowError(id + 'Error', errorLimitMsg + totalCompanyUser);
			} else {
				thisHideError(id + 'Error');
			}
			$('#scrollBox').css('height', $('#step1').height());
		});
		
	} 
	// enforce input checkings
	addInputCheck('#mid',regex_mid,error_mid);
	addInputCheck('#businessName',regex_businessName,error_businessName);
	addInputCheck('#businessShortName',regex_businessShortName,error_businessShortName);
	addInputCheck('#businessType',regex_businessType,error_businessType);
	if(true) {
		addInputCheck('#businessRegistrationNo',regex_businessRegistrationNumber,error_businessRegistrationNumber);
	}
	else {
		addInputCheck('#businessRegistrationNo',regex_businessRegistrationNumber_optional,error_businessRegistrationNumber);
	}
	addInputCheck_3('#address1','#address2',regex_address,'#addressError',error_address);
	addInputCheck_3('#address2','#address1',regex_address_2,'#addressError',error_address);
	addInputCheck('#postcode',regex_postcode,error_postcode);
	addInputCheck('#city',regex_city,error_city);
	addInputCheck('#businessContact',regex_contact,error_businessContact);
	addCompanyUserLimitCheck('#companyUserLimit', regex_companyUserLimit,error_companyUserLimitFormat,error_companyUserLimit, totalCompanyUser);
	addInputCheck('#fullName',regex_name,error_name);
	addInputCheck('#contact',regex_contact_mobile,error_contact);
	addInputCheck('#email',regex_email,error_email);
	addInputCheck('#maxAmountPerTransac',regex_amount,error_amount);
	addInputCheck('#maxAmountPerMonth',regex_amount,error_amount);
	var dupItemArr;
		 function validateInput1(){
			  //return successValidateField($(&quot;#mid&quot;).val(),regex_mid,&quot;#midError&quot;,error_mid);
			  return true;
		 }
		 function validateInput2(){			  
			  return successValidateField($(&quot;#businessName&quot;).val(),regex_businessName,&quot;#businessNameError&quot;,error_businessName);
		 }
		 function validateInput3(){			  
			  return successValidateField($(&quot;#businessShortName&quot;).val(),regex_businessShortName,&quot;#businessShortNameError&quot;,error_businessShortName);
		 }
		 function validateInput3_1(){			  
			  return successValidateField($(&quot;#businessType&quot;).val(),regex_businessType,&quot;#businessTypeError&quot;,error_businessType);
		 }
		 function validateInput4(){			  
			  if(true) {
				return successValidateField($(&quot;#businessRegistrationNo&quot;).val(),regex_businessRegistrationNumber,&quot;#businessRegistrationNoError&quot;,error_businessRegistrationNumber);
			  }
			  else {
				return successValidateField($(&quot;#businessRegistrationNo&quot;).val(),regex_businessRegistrationNumber_optional,&quot;#businessRegistrationNoError&quot;,error_businessRegistrationNumber);
			  }
		 }
		 function validateInput5_1(){			  
			  return successValidateField($(&quot;#address1&quot;).val(),regex_address,&quot;#addressError&quot;,error_address);
		 }
		 function validateInput5_2(){	
			  return successValidateField($(&quot;#address2&quot;).val(),regex_address_2,&quot;#addressError&quot;,error_address);
			  //return true;
		 }
		 function validateInput6(){			  
			  return successValidateField($(&quot;#postcode&quot;).val(),regex_postcode,&quot;#postcodeError&quot;,error_postcode);
		 }
		 function validateInput7(){			  
			  return successValidateField($(&quot;#city&quot;).val(),regex_city,&quot;#cityError&quot;,error_city);
		 }		
		 function validateInput8_1(){			  
			  return successValidateField($(&quot;#businessContact&quot;).val(),regex_contact,&quot;#businessContactError&quot;,error_businessContact) &amp;&amp; notEqualsToEg($(&quot;#businessContact&quot;).val(),hint_contact,&quot;#businessContactError&quot;,error_businessContact);
		 }	
		 function validateInput9(){			  
			  return successValidateField($(&quot;#fullName&quot;).val(),regex_name,&quot;#fullNameError&quot;,error_name);
		 }
		 function validateInput10_1(){			 	
			  return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		 }
		 function validateInput11(){			  
			 return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),hint_email,&quot;#emailError&quot;,error_email);			  		
		 }
		/*  function validateInput12(){			  
			  return (successValidateField($(&quot;#maxAmountPerTransac&quot;).val(),regex_amount,&quot;#maxAmountPerTransacError&quot;,error_amount)  &amp;&amp; correctAmountEntered($(&quot;#maxAmountPerTransac&quot;).val(), 10,&quot;#maxAmountPerTransacError&quot;,error_amount));
		 }
		 function validateInput13(){			  
			  return successValidateField($(&quot;#maxAmountPerMonth&quot;).val(),regex_amount,&quot;#maxAmountPerMonthError&quot;,error_amount) &amp;&amp; correctAmountEntered($(&quot;#maxAmountPerMonth&quot;).val(), 10,&quot;#maxAmountPerMonthError&quot;,error_amount);
		 } */
		 function validateInput14(){			  
			  return successValidateField($(&quot;#companyUserLimit&quot;).val(),regex_companyUserLimit,&quot;#companyUserLimitError&quot;,error_companyUserLimit) &amp;&amp; correctAmountEntered(parseInt($(&quot;#companyUserLimit&quot;).val()),totalCompanyUser,&quot;#companyUserLimitError&quot;,error_companyUserLimit + totalCompanyUser);
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
        success:       showResponse,
        url:       'checkItemsAvailabilityEdit'
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
		thisHideError(&quot;#businessNameError&quot;);
		thisHideError(&quot;#midError&quot;);
		thisHideError(&quot;#contactError&quot;);
		thisHideError(&quot;#emailError&quot;);
	}
	
	$('.next').click(function(){
		goNext($(this));
	});
	
	$('.prev').click(function(){
		prevPage($(this).attr('id'));		
	});
	
	$(&quot;#submitThis&quot;).click(function() {
		$('#customForm').attr('action','doUpdateCompany');
		$('#customForm').submit(); 
	});
	
	function goNext(thisClick){
		//alert($(dummy).attr('id'));
		if($(thisClick).attr('id')==1){
			var error = false;
			var chackMaximumAmount =true;
			
			if(validateInput1() == false) {
				error = true;
			}
			if(validateInput2() == false) {
				error = true;
			}
			if(validateInput3() == false) {
				error = true;
			}
			if(validateInput3_1() == false) {
				error = true;
			}
			if(validateInput4() == false) {
				error = true;
			}
			if(validateInput5_1() == false || validateInput5_2() == false) {
				error = true;
			}
			if(validateInput6() == false) {
				error = true;
			}
			if(validateInput7() == false) {
				error = true;
			}
			
			if(validateInput8_1() == false) {
				error = true;
			}
			if(validateInput9() == false) {
				error = true;
			}
			if(validateInput10_1() == false) {
				error = true;
			}
			if(validateInput11() == false) {
				error = true;
			}
			/* if(validateInput12() == false) {
				error = true;
				chackMaximumAmount = false; 
			}
			if(validateInput13() == false) {
				error = true;
				chackMaximumAmount = false; 
			} */
			if(validateInput14() == false) {
				error = true;
			}
			
			/* Chack Maximum Amount per Transaction > per Month */
			/* if(chackMaximumAmount){
				var maxAmountPerTransac = parseInt($('#maxAmountPerTransac').val());
				var maxAmountPerMonth = parseInt($('#maxAmountPerMonth').val());
				if(maxAmountPerTransac > maxAmountPerMonth){
					thisShowError('#maxAmountPerMonthError', error_maximumAmount);
					error = true;
			    }else{
			    	 thisHideError('#maxAmountPerMonthError');
			    }
			} */
			
			if(error == false) {
		 		$(&quot;#midPass&quot;).html($(&quot;#mid&quot;).html());
		 		$(&quot;#businessNamePass&quot;).html($(&quot;#businessName&quot;).val());
		 		$(&quot;#businessShortNamePass&quot;).html($(&quot;#businessShortName&quot;).val());
		 		$(&quot;#businessTypePass&quot;).html($(&quot;#businessType&quot;).val());
		 		$(&quot;#businessRegistrationNoPass&quot;).text($(&quot;#businessRegistrationNo&quot;).val()).html();
		 		$(&quot;#address1Pass&quot;).text($(&quot;#address1&quot;).val()).html();
		 		$(&quot;#address2Pass&quot;).text($(&quot;#address2&quot;).val()).html();
		 		$(&quot;#postcodePass&quot;).html($(&quot;#postcode&quot;).val());
		 		$(&quot;#cityPass&quot;).html($(&quot;#city&quot;).val());
		 		$(&quot;#statePass&quot;).html($(&quot;#state&quot;).val());
		 		var bizContactSplit = splitContact($(&quot;#businessContact&quot;).val());
	 			$(&quot;#businessContact_prefix&quot;).val(bizContactSplit[0]);
	 			$(&quot;#businessContact_body&quot;).val(bizContactSplit[1]);
		 		$(&quot;#businessContactPass&quot;).html($(&quot;#businessContact_prefix&quot;).val() + &quot;-&quot; + $(&quot;#businessContact_body&quot;).val());
		 		$(&quot;#companyUserLimitPass&quot;).html($(&quot;#companyUserLimit&quot;).val());
// 		 		$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
		 		$(&quot;#fullNamePass&quot;).html($(&quot;#fullName&quot;).val());
		 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
		 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
		 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
		 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
		 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
		 		/* $(&quot;#maxAmountPerTransacPass&quot;).html($(&quot;#maxAmountPerTransac&quot;).val().replace(/\B(?=(\d{3})+(?!\d))/g, &quot;,&quot;));
		 		$(&quot;#maxAmountPerMonthPass&quot;).html($(&quot;#maxAmountPerMonth&quot;).val().replace(/\B(?=(\d{3})+(?!\d))/g, &quot;,&quot;)); */	
		 		$(&quot;#remarkPass&quot;).text($(&quot;#remark&quot;).val());	

		 		if($('#useSSO').is(&quot;:checked&quot;)) {
            		$('#useSSOResult').html(&quot;&lt;p>&lt;img src='../../resources/images/icon/imgTickS.png' height='15' width='18' style='margin-right:5px;'/>Able to perform - SSO&lt;/p>&quot;);
            	} else {
            		$('#useSSOResult').html(&quot;&lt;p>&lt;img src='../../resources/images/icon/imgCrossS.png' height='15' width='15' style='margin-right:8px;'/>Able to perform - SSO&lt;/p>&quot;);
            	}
		 		
		 	}else{ 
		 		$('#scrollBox').css('height', $('#step1').height());			 		
		 		return false;
		 	}
			toSubmit(options);
			$(thisClick).unbind('click');
		}
	}
	
	
		 
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
 





	
	
		Edit Company Details
	

	
	
		
			
				 
	           	Company Details
	          	 
	          	Review &amp; Confirm
	         	 
	          	Complete
			
			
		
	

	
	
    		
	
		
		
			
				
				 	                
	                Business Details
	                Company Name
	                
	                    
	                    
	                
	                Company Short Name
	                
	                    
	                    
						(Display on application)
	                     (Maximum 25 characters)
	                    
	                    
	                
	                Type of Business
	                
	                    
	                    
	                
	                Business Registration Number (BRN)
                	
                		
                		(Optional)
                		
                	 
                	Business Registration Address
                	
                		
                	
                	
                	
                		
                		(Optional)
                		
                	
                	Region/City
                	
                		
                		
                	
                	Province
                	
                		Bangkok							
							
											Bangkok
										
											Amnat Charoen
										
											Ang Thong
										
											Ayutthaya
										
											Bueng Kan
										
											Buriram
										
											Chachoengsao
										
											Chainat
										
											Chaiyaphum
										
											Chanthaburi
										
											Chiang Mai
										
											Chiang Rai
										
											Chonburi
										
											Chumphon
										
											Kalasin
										
											Kamphaeng Phet
										
											Kanchanaburi
										
											Khon Kaen
										
											Krabi
										
											Lampang
										
											Lamphun
										
											Loei
										
											Lopburi
										
											Mae Hong Son
										
											Maha Sarakham
										
											Mukdahan
										
											Nakhon Nayok
										
											Nakhon Pathom
										
											Nakhon Phanom
										
											Nakhon Ratchasima
										
											Nakhon Sawan
										
											Nakhon Si Thammarat
										
											Nan
										
											Narathiwat
										
											Nong Bua Lamphu
										
											Nong Khai
										
											Nonthaburi
										
											Pathum Thani
										
											Pattani
										
											Phang Nga
										
											Phatthalung
										
											Phayao
										
											Phetchabun
										
											Phetchaburi
										
											Phichit
										
											Phitsanulok
										
											Phrae
										
											Phuket
										
											Prachinburi
										
											Prachuap Khiri Khan
										
											Ranong
										
											Ratchaburi
										
											Rayong
										
											Roi Et
										
											Sa Kaeo
										
											Sakon Nakhon
										
											Samut Prakan
										
											Samut Sakhon
										
											Samut Songkhram
										
											Saraburi
										
											Satun
										
											Sing Buri
										
											Sisaket
										
											Songkhla
										
											Sukhothai
										
											Suphan Buri
										
											Surat Thani
										
											Surin
										
											Tak
										
											Trang
										
											Trat
										
											Ubon Ratchathani
										
											Udon Thani
										
											Uthai Thani
										
											Uttaradit
										
											Yala
										
											Yasothon
											
						
                	
                	Postcode
                	
                		
                		
                	
                	Business Contact No.
                	
                		
                		if (document.getElementById('businessContact').value != '021234567') document.getElementById('businessContact').style.color = '#333333';
                		
                		
                		
                	
                	Company User Limit
                	
                		
                		
                	
	                
					
						
						Single Sign On (SSO)
						
						 	
		                		Able to perform - SSO
				         	
						
					
						
						Magstripe (MSR)
						
						 	
						 		
				         		Able to perform - MSR
				         	
						
					   
	           		
	                
	                Authoriser Details
	                Name
                	
                		
                		
                	
                	Contact No.
                	
                		
                		if (document.getElementById('contact').value != '08X1234567') document.getElementById('contact').style.color = '#333333';
                		
                		
                		(For mobile activation code)
                		
                	
                	Email Address
                	
                		
                    	if (document.getElementById('email').value != 'john.doe@gmail.com') document.getElementById('email').style.color = '#333333';
                		(For email notifications)
                		
                	
	                
	                
	                
	                
	                
	                
	                Transactions Limit
	                Permanent Transaction Limit
	                
	                
	                THB  
	                	60000
	                	
	                
	                
	                Permanent Month Limit
	                
	                	THB  
	                	110000
	                	
	                
	                
	                
	                
	                
	                Remarks
		            Remarks
		            
		            	Test Edit by automate
		            	(Optional)
						
							Max characters: 250  remaining
						
		            	
		            
		            
	                	                
				
				
				
			   		Submit
					
				
				
			
		
		
		
			
				
				
	                Business Details
	                Company Name
                	
                	Company Short Name
	                
                	Type of Business
	                
	                Business Registration Number (BRN)
                	
                	Business Registration Address
                	
                	
                	
                	Region/City
                	
                	Province
                	
                	Postcode
                	
                	Business Contact No.
                	
                	Company User Limit
                	
	                
	                
						
						Single Sign On (SSO)
						
						 	
						
					
					
	                Authoriser Details

	                Name
                	
                	Contact No.
                	
                	Email Address
                	
	                
	                
	                
	                
	                Remarks
	                
	                
                
				
				
				
			    	Back  
			   		Confirm
					
				
				
			
		
		
		
	
	


  
  





	        	
	    
            
		
        
        
    </value>
      <webElementGuid>557691d1-f634-4323-b24e-059087f04dff</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;mainContainer&quot;)</value>
      <webElementGuid>56c8930e-9979-48ad-8f43-413987a044a2</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='mainContainer']</value>
      <webElementGuid>9e5d3cfd-0a72-4e7b-8fe9-78281e9f0faf</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='topContainer']/div[4]</value>
      <webElementGuid>59b0ab69-9816-4adf-8340-495cbfd777d0</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Administrator'])[1]/following::div[2]</value>
      <webElementGuid>9bb28d1b-129a-46aa-90c3-04f1c6f4a861</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='ManageCredit Settlements'])[1]/following::div[2]</value>
      <webElementGuid>054b7313-e580-4e4b-b35d-75fe33dd97dd</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[4]</value>
      <webElementGuid>5d9fbe88-b5af-4aa7-9bb7-99542de961dc</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'mainContainer' and (text() = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Company Summary



	Add a Company




	K SHOP Company Summary


		            
		        
		        
		        
	        
	
			
	        
	        	





 
$(document).ready(function() {
	// hint text
	var hint_contact = &quot;021234567&quot;;
	var hint_contact_mobile = &quot;08X1234567&quot;;
	var hint_email = &quot;john.doe@gmail.com&quot;;
	
	var totalCompanyUser = 1;
	function addCompanyUserLimitCheck(id,regex,errorMsg,errorLimitMsg,totalCompanyUser) {
		$(id).change(function() {
			// remove leading and trailing spaces
			$(this).val($.trim($(this).val()));
			// get text
			var text = $(this).val();
			// validate
			var formatInvalid = invalidFormat(text, regex);
			var exceedInvalid = parseInt(text) &lt; totalCompanyUser;
			if(formatInvalid == true) {
				thisShowError(id + &quot; , &quot;'&quot; , &quot;Error&quot; , &quot;'&quot; , &quot;, errorMsg);
			} else if(exceedInvalid == true) {
				thisShowError(id + &quot; , &quot;'&quot; , &quot;Error&quot; , &quot;'&quot; , &quot;, errorLimitMsg + totalCompanyUser);
			} else {
				thisHideError(id + &quot; , &quot;'&quot; , &quot;Error&quot; , &quot;'&quot; , &quot;);
			}
			$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
		});
		
	} 
	// enforce input checkings
	addInputCheck(&quot; , &quot;'&quot; , &quot;#mid&quot; , &quot;'&quot; , &quot;,regex_mid,error_mid);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessName&quot; , &quot;'&quot; , &quot;,regex_businessName,error_businessName);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessShortName&quot; , &quot;'&quot; , &quot;,regex_businessShortName,error_businessShortName);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessType&quot; , &quot;'&quot; , &quot;,regex_businessType,error_businessType);
	if(true) {
		addInputCheck(&quot; , &quot;'&quot; , &quot;#businessRegistrationNo&quot; , &quot;'&quot; , &quot;,regex_businessRegistrationNumber,error_businessRegistrationNumber);
	}
	else {
		addInputCheck(&quot; , &quot;'&quot; , &quot;#businessRegistrationNo&quot; , &quot;'&quot; , &quot;,regex_businessRegistrationNumber_optional,error_businessRegistrationNumber);
	}
	addInputCheck_3(&quot; , &quot;'&quot; , &quot;#address1&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#address2&quot; , &quot;'&quot; , &quot;,regex_address,&quot; , &quot;'&quot; , &quot;#addressError&quot; , &quot;'&quot; , &quot;,error_address);
	addInputCheck_3(&quot; , &quot;'&quot; , &quot;#address2&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#address1&quot; , &quot;'&quot; , &quot;,regex_address_2,&quot; , &quot;'&quot; , &quot;#addressError&quot; , &quot;'&quot; , &quot;,error_address);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#postcode&quot; , &quot;'&quot; , &quot;,regex_postcode,error_postcode);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#city&quot; , &quot;'&quot; , &quot;,regex_city,error_city);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessContact&quot; , &quot;'&quot; , &quot;,regex_contact,error_businessContact);
	addCompanyUserLimitCheck(&quot; , &quot;'&quot; , &quot;#companyUserLimit&quot; , &quot;'&quot; , &quot;, regex_companyUserLimit,error_companyUserLimitFormat,error_companyUserLimit, totalCompanyUser);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#fullName&quot; , &quot;'&quot; , &quot;,regex_name,error_name);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#contact&quot; , &quot;'&quot; , &quot;,regex_contact_mobile,error_contact);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#email&quot; , &quot;'&quot; , &quot;,regex_email,error_email);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#maxAmountPerTransac&quot; , &quot;'&quot; , &quot;,regex_amount,error_amount);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonth&quot; , &quot;'&quot; , &quot;,regex_amount,error_amount);
	var dupItemArr;
		 function validateInput1(){
			  //return successValidateField($(&quot;#mid&quot;).val(),regex_mid,&quot;#midError&quot;,error_mid);
			  return true;
		 }
		 function validateInput2(){			  
			  return successValidateField($(&quot;#businessName&quot;).val(),regex_businessName,&quot;#businessNameError&quot;,error_businessName);
		 }
		 function validateInput3(){			  
			  return successValidateField($(&quot;#businessShortName&quot;).val(),regex_businessShortName,&quot;#businessShortNameError&quot;,error_businessShortName);
		 }
		 function validateInput3_1(){			  
			  return successValidateField($(&quot;#businessType&quot;).val(),regex_businessType,&quot;#businessTypeError&quot;,error_businessType);
		 }
		 function validateInput4(){			  
			  if(true) {
				return successValidateField($(&quot;#businessRegistrationNo&quot;).val(),regex_businessRegistrationNumber,&quot;#businessRegistrationNoError&quot;,error_businessRegistrationNumber);
			  }
			  else {
				return successValidateField($(&quot;#businessRegistrationNo&quot;).val(),regex_businessRegistrationNumber_optional,&quot;#businessRegistrationNoError&quot;,error_businessRegistrationNumber);
			  }
		 }
		 function validateInput5_1(){			  
			  return successValidateField($(&quot;#address1&quot;).val(),regex_address,&quot;#addressError&quot;,error_address);
		 }
		 function validateInput5_2(){	
			  return successValidateField($(&quot;#address2&quot;).val(),regex_address_2,&quot;#addressError&quot;,error_address);
			  //return true;
		 }
		 function validateInput6(){			  
			  return successValidateField($(&quot;#postcode&quot;).val(),regex_postcode,&quot;#postcodeError&quot;,error_postcode);
		 }
		 function validateInput7(){			  
			  return successValidateField($(&quot;#city&quot;).val(),regex_city,&quot;#cityError&quot;,error_city);
		 }		
		 function validateInput8_1(){			  
			  return successValidateField($(&quot;#businessContact&quot;).val(),regex_contact,&quot;#businessContactError&quot;,error_businessContact) &amp;&amp; notEqualsToEg($(&quot;#businessContact&quot;).val(),hint_contact,&quot;#businessContactError&quot;,error_businessContact);
		 }	
		 function validateInput9(){			  
			  return successValidateField($(&quot;#fullName&quot;).val(),regex_name,&quot;#fullNameError&quot;,error_name);
		 }
		 function validateInput10_1(){			 	
			  return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		 }
		 function validateInput11(){			  
			 return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),hint_email,&quot;#emailError&quot;,error_email);			  		
		 }
		/*  function validateInput12(){			  
			  return (successValidateField($(&quot;#maxAmountPerTransac&quot;).val(),regex_amount,&quot;#maxAmountPerTransacError&quot;,error_amount)  &amp;&amp; correctAmountEntered($(&quot;#maxAmountPerTransac&quot;).val(), 10,&quot;#maxAmountPerTransacError&quot;,error_amount));
		 }
		 function validateInput13(){			  
			  return successValidateField($(&quot;#maxAmountPerMonth&quot;).val(),regex_amount,&quot;#maxAmountPerMonthError&quot;,error_amount) &amp;&amp; correctAmountEntered($(&quot;#maxAmountPerMonth&quot;).val(), 10,&quot;#maxAmountPerMonthError&quot;,error_amount);
		 } */
		 function validateInput14(){			  
			  return successValidateField($(&quot;#companyUserLimit&quot;).val(),regex_companyUserLimit,&quot;#companyUserLimitError&quot;,error_companyUserLimit) &amp;&amp; correctAmountEntered(parseInt($(&quot;#companyUserLimit&quot;).val()),totalCompanyUser,&quot;#companyUserLimitError&quot;,error_companyUserLimit + totalCompanyUser);
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
        success:       showResponse,
        url:       &quot; , &quot;'&quot; , &quot;checkItemsAvailabilityEdit&quot; , &quot;'&quot; , &quot;
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
		thisHideError(&quot;#businessNameError&quot;);
		thisHideError(&quot;#midError&quot;);
		thisHideError(&quot;#contactError&quot;);
		thisHideError(&quot;#emailError&quot;);
	}
	
	$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
		goNext($(this));
	});
	
	$(&quot; , &quot;'&quot; , &quot;.prev&quot; , &quot;'&quot; , &quot;).click(function(){
		prevPage($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));		
	});
	
	$(&quot;#submitThis&quot;).click(function() {
		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doUpdateCompany&quot; , &quot;'&quot; , &quot;);
		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(); 
	});
	
	function goNext(thisClick){
		//alert($(dummy).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));
		if($(thisClick).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)==1){
			var error = false;
			var chackMaximumAmount =true;
			
			if(validateInput1() == false) {
				error = true;
			}
			if(validateInput2() == false) {
				error = true;
			}
			if(validateInput3() == false) {
				error = true;
			}
			if(validateInput3_1() == false) {
				error = true;
			}
			if(validateInput4() == false) {
				error = true;
			}
			if(validateInput5_1() == false || validateInput5_2() == false) {
				error = true;
			}
			if(validateInput6() == false) {
				error = true;
			}
			if(validateInput7() == false) {
				error = true;
			}
			
			if(validateInput8_1() == false) {
				error = true;
			}
			if(validateInput9() == false) {
				error = true;
			}
			if(validateInput10_1() == false) {
				error = true;
			}
			if(validateInput11() == false) {
				error = true;
			}
			/* if(validateInput12() == false) {
				error = true;
				chackMaximumAmount = false; 
			}
			if(validateInput13() == false) {
				error = true;
				chackMaximumAmount = false; 
			} */
			if(validateInput14() == false) {
				error = true;
			}
			
			/* Chack Maximum Amount per Transaction > per Month */
			/* if(chackMaximumAmount){
				var maxAmountPerTransac = parseInt($(&quot; , &quot;'&quot; , &quot;#maxAmountPerTransac&quot; , &quot;'&quot; , &quot;).val());
				var maxAmountPerMonth = parseInt($(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonth&quot; , &quot;'&quot; , &quot;).val());
				if(maxAmountPerTransac > maxAmountPerMonth){
					thisShowError(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonthError&quot; , &quot;'&quot; , &quot;, error_maximumAmount);
					error = true;
			    }else{
			    	 thisHideError(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonthError&quot; , &quot;'&quot; , &quot;);
			    }
			} */
			
			if(error == false) {
		 		$(&quot;#midPass&quot;).html($(&quot;#mid&quot;).html());
		 		$(&quot;#businessNamePass&quot;).html($(&quot;#businessName&quot;).val());
		 		$(&quot;#businessShortNamePass&quot;).html($(&quot;#businessShortName&quot;).val());
		 		$(&quot;#businessTypePass&quot;).html($(&quot;#businessType&quot;).val());
		 		$(&quot;#businessRegistrationNoPass&quot;).text($(&quot;#businessRegistrationNo&quot;).val()).html();
		 		$(&quot;#address1Pass&quot;).text($(&quot;#address1&quot;).val()).html();
		 		$(&quot;#address2Pass&quot;).text($(&quot;#address2&quot;).val()).html();
		 		$(&quot;#postcodePass&quot;).html($(&quot;#postcode&quot;).val());
		 		$(&quot;#cityPass&quot;).html($(&quot;#city&quot;).val());
		 		$(&quot;#statePass&quot;).html($(&quot;#state&quot;).val());
		 		var bizContactSplit = splitContact($(&quot;#businessContact&quot;).val());
	 			$(&quot;#businessContact_prefix&quot;).val(bizContactSplit[0]);
	 			$(&quot;#businessContact_body&quot;).val(bizContactSplit[1]);
		 		$(&quot;#businessContactPass&quot;).html($(&quot;#businessContact_prefix&quot;).val() + &quot;-&quot; + $(&quot;#businessContact_body&quot;).val());
		 		$(&quot;#companyUserLimitPass&quot;).html($(&quot;#companyUserLimit&quot;).val());
// 		 		$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
		 		$(&quot;#fullNamePass&quot;).html($(&quot;#fullName&quot;).val());
		 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
		 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
		 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
		 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
		 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
		 		/* $(&quot;#maxAmountPerTransacPass&quot;).html($(&quot;#maxAmountPerTransac&quot;).val().replace(/\B(?=(\d{3})+(?!\d))/g, &quot;,&quot;));
		 		$(&quot;#maxAmountPerMonthPass&quot;).html($(&quot;#maxAmountPerMonth&quot;).val().replace(/\B(?=(\d{3})+(?!\d))/g, &quot;,&quot;)); */	
		 		$(&quot;#remarkPass&quot;).text($(&quot;#remark&quot;).val());	

		 		if($(&quot; , &quot;'&quot; , &quot;#useSSO&quot; , &quot;'&quot; , &quot;).is(&quot;:checked&quot;)) {
            		$(&quot; , &quot;'&quot; , &quot;#useSSOResult&quot; , &quot;'&quot; , &quot;).html(&quot;&lt;p>&lt;img src=&quot; , &quot;'&quot; , &quot;../../resources/images/icon/imgTickS.png&quot; , &quot;'&quot; , &quot; height=&quot; , &quot;'&quot; , &quot;15&quot; , &quot;'&quot; , &quot; width=&quot; , &quot;'&quot; , &quot;18&quot; , &quot;'&quot; , &quot; style=&quot; , &quot;'&quot; , &quot;margin-right:5px;&quot; , &quot;'&quot; , &quot;/>Able to perform - SSO&lt;/p>&quot;);
            	} else {
            		$(&quot; , &quot;'&quot; , &quot;#useSSOResult&quot; , &quot;'&quot; , &quot;).html(&quot;&lt;p>&lt;img src=&quot; , &quot;'&quot; , &quot;../../resources/images/icon/imgCrossS.png&quot; , &quot;'&quot; , &quot; height=&quot; , &quot;'&quot; , &quot;15&quot; , &quot;'&quot; , &quot; width=&quot; , &quot;'&quot; , &quot;15&quot; , &quot;'&quot; , &quot; style=&quot; , &quot;'&quot; , &quot;margin-right:8px;&quot; , &quot;'&quot; , &quot;/>Able to perform - SSO&lt;/p>&quot;);
            	}
		 		
		 	}else{ 
		 		$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());			 		
		 		return false;
		 	}
			toSubmit(options);
			$(thisClick).unbind(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;);
		}
	}
	
	
		 
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
 





	
	
		Edit Company Details
	

	
	
		
			
				 
	           	Company Details
	          	 
	          	Review &amp; Confirm
	         	 
	          	Complete
			
			
		
	

	
	
    		
	
		
		
			
				
				 	                
	                Business Details
	                Company Name
	                
	                    
	                    
	                
	                Company Short Name
	                
	                    
	                    
						(Display on application)
	                     (Maximum 25 characters)
	                    
	                    
	                
	                Type of Business
	                
	                    
	                    
	                
	                Business Registration Number (BRN)
                	
                		
                		(Optional)
                		
                	 
                	Business Registration Address
                	
                		
                	
                	
                	
                		
                		(Optional)
                		
                	
                	Region/City
                	
                		
                		
                	
                	Province
                	
                		Bangkok							
							
											Bangkok
										
											Amnat Charoen
										
											Ang Thong
										
											Ayutthaya
										
											Bueng Kan
										
											Buriram
										
											Chachoengsao
										
											Chainat
										
											Chaiyaphum
										
											Chanthaburi
										
											Chiang Mai
										
											Chiang Rai
										
											Chonburi
										
											Chumphon
										
											Kalasin
										
											Kamphaeng Phet
										
											Kanchanaburi
										
											Khon Kaen
										
											Krabi
										
											Lampang
										
											Lamphun
										
											Loei
										
											Lopburi
										
											Mae Hong Son
										
											Maha Sarakham
										
											Mukdahan
										
											Nakhon Nayok
										
											Nakhon Pathom
										
											Nakhon Phanom
										
											Nakhon Ratchasima
										
											Nakhon Sawan
										
											Nakhon Si Thammarat
										
											Nan
										
											Narathiwat
										
											Nong Bua Lamphu
										
											Nong Khai
										
											Nonthaburi
										
											Pathum Thani
										
											Pattani
										
											Phang Nga
										
											Phatthalung
										
											Phayao
										
											Phetchabun
										
											Phetchaburi
										
											Phichit
										
											Phitsanulok
										
											Phrae
										
											Phuket
										
											Prachinburi
										
											Prachuap Khiri Khan
										
											Ranong
										
											Ratchaburi
										
											Rayong
										
											Roi Et
										
											Sa Kaeo
										
											Sakon Nakhon
										
											Samut Prakan
										
											Samut Sakhon
										
											Samut Songkhram
										
											Saraburi
										
											Satun
										
											Sing Buri
										
											Sisaket
										
											Songkhla
										
											Sukhothai
										
											Suphan Buri
										
											Surat Thani
										
											Surin
										
											Tak
										
											Trang
										
											Trat
										
											Ubon Ratchathani
										
											Udon Thani
										
											Uthai Thani
										
											Uttaradit
										
											Yala
										
											Yasothon
											
						
                	
                	Postcode
                	
                		
                		
                	
                	Business Contact No.
                	
                		
                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;businessContact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;021234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;businessContact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
                		
                		
                		
                	
                	Company User Limit
                	
                		
                		
                	
	                
					
						
						Single Sign On (SSO)
						
						 	
		                		Able to perform - SSO
				         	
						
					
						
						Magstripe (MSR)
						
						 	
						 		
				         		Able to perform - MSR
				         	
						
					   
	           		
	                
	                Authoriser Details
	                Name
                	
                		
                		
                	
                	Contact No.
                	
                		
                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;08X1234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
                		
                		
                		(For mobile activation code)
                		
                	
                	Email Address
                	
                		
                    	if (document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;john.doe@gmail.com&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
                		(For email notifications)
                		
                	
	                
	                
	                
	                
	                
	                
	                Transactions Limit
	                Permanent Transaction Limit
	                
	                
	                THB  
	                	60000
	                	
	                
	                
	                Permanent Month Limit
	                
	                	THB  
	                	110000
	                	
	                
	                
	                
	                
	                
	                Remarks
		            Remarks
		            
		            	Test Edit by automate
		            	(Optional)
						
							Max characters: 250  remaining
						
		            	
		            
		            
	                	                
				
				
				
			   		Submit
					
				
				
			
		
		
		
			
				
				
	                Business Details
	                Company Name
                	
                	Company Short Name
	                
                	Type of Business
	                
	                Business Registration Number (BRN)
                	
                	Business Registration Address
                	
                	
                	
                	Region/City
                	
                	Province
                	
                	Postcode
                	
                	Business Contact No.
                	
                	Company User Limit
                	
	                
	                
						
						Single Sign On (SSO)
						
						 	
						
					
					
	                Authoriser Details

	                Name
                	
                	Contact No.
                	
                	Email Address
                	
	                
	                
	                
	                
	                Remarks
	                
	                
                
				
				
				
			    	Back  
			   		Confirm
					
				
				
			
		
		
		
	
	


  
  





	        	
	    
            
		
        
        
    &quot;) or . = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Company Summary



	Add a Company




	K SHOP Company Summary


		            
		        
		        
		        
	        
	
			
	        
	        	





 
$(document).ready(function() {
	// hint text
	var hint_contact = &quot;021234567&quot;;
	var hint_contact_mobile = &quot;08X1234567&quot;;
	var hint_email = &quot;john.doe@gmail.com&quot;;
	
	var totalCompanyUser = 1;
	function addCompanyUserLimitCheck(id,regex,errorMsg,errorLimitMsg,totalCompanyUser) {
		$(id).change(function() {
			// remove leading and trailing spaces
			$(this).val($.trim($(this).val()));
			// get text
			var text = $(this).val();
			// validate
			var formatInvalid = invalidFormat(text, regex);
			var exceedInvalid = parseInt(text) &lt; totalCompanyUser;
			if(formatInvalid == true) {
				thisShowError(id + &quot; , &quot;'&quot; , &quot;Error&quot; , &quot;'&quot; , &quot;, errorMsg);
			} else if(exceedInvalid == true) {
				thisShowError(id + &quot; , &quot;'&quot; , &quot;Error&quot; , &quot;'&quot; , &quot;, errorLimitMsg + totalCompanyUser);
			} else {
				thisHideError(id + &quot; , &quot;'&quot; , &quot;Error&quot; , &quot;'&quot; , &quot;);
			}
			$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());
		});
		
	} 
	// enforce input checkings
	addInputCheck(&quot; , &quot;'&quot; , &quot;#mid&quot; , &quot;'&quot; , &quot;,regex_mid,error_mid);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessName&quot; , &quot;'&quot; , &quot;,regex_businessName,error_businessName);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessShortName&quot; , &quot;'&quot; , &quot;,regex_businessShortName,error_businessShortName);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessType&quot; , &quot;'&quot; , &quot;,regex_businessType,error_businessType);
	if(true) {
		addInputCheck(&quot; , &quot;'&quot; , &quot;#businessRegistrationNo&quot; , &quot;'&quot; , &quot;,regex_businessRegistrationNumber,error_businessRegistrationNumber);
	}
	else {
		addInputCheck(&quot; , &quot;'&quot; , &quot;#businessRegistrationNo&quot; , &quot;'&quot; , &quot;,regex_businessRegistrationNumber_optional,error_businessRegistrationNumber);
	}
	addInputCheck_3(&quot; , &quot;'&quot; , &quot;#address1&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#address2&quot; , &quot;'&quot; , &quot;,regex_address,&quot; , &quot;'&quot; , &quot;#addressError&quot; , &quot;'&quot; , &quot;,error_address);
	addInputCheck_3(&quot; , &quot;'&quot; , &quot;#address2&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;#address1&quot; , &quot;'&quot; , &quot;,regex_address_2,&quot; , &quot;'&quot; , &quot;#addressError&quot; , &quot;'&quot; , &quot;,error_address);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#postcode&quot; , &quot;'&quot; , &quot;,regex_postcode,error_postcode);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#city&quot; , &quot;'&quot; , &quot;,regex_city,error_city);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#businessContact&quot; , &quot;'&quot; , &quot;,regex_contact,error_businessContact);
	addCompanyUserLimitCheck(&quot; , &quot;'&quot; , &quot;#companyUserLimit&quot; , &quot;'&quot; , &quot;, regex_companyUserLimit,error_companyUserLimitFormat,error_companyUserLimit, totalCompanyUser);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#fullName&quot; , &quot;'&quot; , &quot;,regex_name,error_name);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#contact&quot; , &quot;'&quot; , &quot;,regex_contact_mobile,error_contact);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#email&quot; , &quot;'&quot; , &quot;,regex_email,error_email);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#maxAmountPerTransac&quot; , &quot;'&quot; , &quot;,regex_amount,error_amount);
	addInputCheck(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonth&quot; , &quot;'&quot; , &quot;,regex_amount,error_amount);
	var dupItemArr;
		 function validateInput1(){
			  //return successValidateField($(&quot;#mid&quot;).val(),regex_mid,&quot;#midError&quot;,error_mid);
			  return true;
		 }
		 function validateInput2(){			  
			  return successValidateField($(&quot;#businessName&quot;).val(),regex_businessName,&quot;#businessNameError&quot;,error_businessName);
		 }
		 function validateInput3(){			  
			  return successValidateField($(&quot;#businessShortName&quot;).val(),regex_businessShortName,&quot;#businessShortNameError&quot;,error_businessShortName);
		 }
		 function validateInput3_1(){			  
			  return successValidateField($(&quot;#businessType&quot;).val(),regex_businessType,&quot;#businessTypeError&quot;,error_businessType);
		 }
		 function validateInput4(){			  
			  if(true) {
				return successValidateField($(&quot;#businessRegistrationNo&quot;).val(),regex_businessRegistrationNumber,&quot;#businessRegistrationNoError&quot;,error_businessRegistrationNumber);
			  }
			  else {
				return successValidateField($(&quot;#businessRegistrationNo&quot;).val(),regex_businessRegistrationNumber_optional,&quot;#businessRegistrationNoError&quot;,error_businessRegistrationNumber);
			  }
		 }
		 function validateInput5_1(){			  
			  return successValidateField($(&quot;#address1&quot;).val(),regex_address,&quot;#addressError&quot;,error_address);
		 }
		 function validateInput5_2(){	
			  return successValidateField($(&quot;#address2&quot;).val(),regex_address_2,&quot;#addressError&quot;,error_address);
			  //return true;
		 }
		 function validateInput6(){			  
			  return successValidateField($(&quot;#postcode&quot;).val(),regex_postcode,&quot;#postcodeError&quot;,error_postcode);
		 }
		 function validateInput7(){			  
			  return successValidateField($(&quot;#city&quot;).val(),regex_city,&quot;#cityError&quot;,error_city);
		 }		
		 function validateInput8_1(){			  
			  return successValidateField($(&quot;#businessContact&quot;).val(),regex_contact,&quot;#businessContactError&quot;,error_businessContact) &amp;&amp; notEqualsToEg($(&quot;#businessContact&quot;).val(),hint_contact,&quot;#businessContactError&quot;,error_businessContact);
		 }	
		 function validateInput9(){			  
			  return successValidateField($(&quot;#fullName&quot;).val(),regex_name,&quot;#fullNameError&quot;,error_name);
		 }
		 function validateInput10_1(){			 	
			  return successValidateField($(&quot;#contact&quot;).val(),regex_contact_mobile,&quot;#contactError&quot;,error_contact) &amp;&amp; notEqualsToEg($(&quot;#contact&quot;).val(),hint_contact_mobile,&quot;#contactError&quot;,error_contact);
		 }
		 function validateInput11(){			  
			 return successValidateField($(&quot;#email&quot;).val(),regex_email,&quot;#emailError&quot;,error_email) &amp;&amp; notEqualsToEg($(&quot;#email&quot;).val(),hint_email,&quot;#emailError&quot;,error_email);			  		
		 }
		/*  function validateInput12(){			  
			  return (successValidateField($(&quot;#maxAmountPerTransac&quot;).val(),regex_amount,&quot;#maxAmountPerTransacError&quot;,error_amount)  &amp;&amp; correctAmountEntered($(&quot;#maxAmountPerTransac&quot;).val(), 10,&quot;#maxAmountPerTransacError&quot;,error_amount));
		 }
		 function validateInput13(){			  
			  return successValidateField($(&quot;#maxAmountPerMonth&quot;).val(),regex_amount,&quot;#maxAmountPerMonthError&quot;,error_amount) &amp;&amp; correctAmountEntered($(&quot;#maxAmountPerMonth&quot;).val(), 10,&quot;#maxAmountPerMonthError&quot;,error_amount);
		 } */
		 function validateInput14(){			  
			  return successValidateField($(&quot;#companyUserLimit&quot;).val(),regex_companyUserLimit,&quot;#companyUserLimitError&quot;,error_companyUserLimit) &amp;&amp; correctAmountEntered(parseInt($(&quot;#companyUserLimit&quot;).val()),totalCompanyUser,&quot;#companyUserLimitError&quot;,error_companyUserLimit + totalCompanyUser);
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
        success:       showResponse,
        url:       &quot; , &quot;'&quot; , &quot;checkItemsAvailabilityEdit&quot; , &quot;'&quot; , &quot;
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
		thisHideError(&quot;#businessNameError&quot;);
		thisHideError(&quot;#midError&quot;);
		thisHideError(&quot;#contactError&quot;);
		thisHideError(&quot;#emailError&quot;);
	}
	
	$(&quot; , &quot;'&quot; , &quot;.next&quot; , &quot;'&quot; , &quot;).click(function(){
		goNext($(this));
	});
	
	$(&quot; , &quot;'&quot; , &quot;.prev&quot; , &quot;'&quot; , &quot;).click(function(){
		prevPage($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));		
	});
	
	$(&quot;#submitThis&quot;).click(function() {
		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;action&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;doUpdateCompany&quot; , &quot;'&quot; , &quot;);
		$(&quot; , &quot;'&quot; , &quot;#customForm&quot; , &quot;'&quot; , &quot;).submit(); 
	});
	
	function goNext(thisClick){
		//alert($(dummy).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;));
		if($(thisClick).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)==1){
			var error = false;
			var chackMaximumAmount =true;
			
			if(validateInput1() == false) {
				error = true;
			}
			if(validateInput2() == false) {
				error = true;
			}
			if(validateInput3() == false) {
				error = true;
			}
			if(validateInput3_1() == false) {
				error = true;
			}
			if(validateInput4() == false) {
				error = true;
			}
			if(validateInput5_1() == false || validateInput5_2() == false) {
				error = true;
			}
			if(validateInput6() == false) {
				error = true;
			}
			if(validateInput7() == false) {
				error = true;
			}
			
			if(validateInput8_1() == false) {
				error = true;
			}
			if(validateInput9() == false) {
				error = true;
			}
			if(validateInput10_1() == false) {
				error = true;
			}
			if(validateInput11() == false) {
				error = true;
			}
			/* if(validateInput12() == false) {
				error = true;
				chackMaximumAmount = false; 
			}
			if(validateInput13() == false) {
				error = true;
				chackMaximumAmount = false; 
			} */
			if(validateInput14() == false) {
				error = true;
			}
			
			/* Chack Maximum Amount per Transaction > per Month */
			/* if(chackMaximumAmount){
				var maxAmountPerTransac = parseInt($(&quot; , &quot;'&quot; , &quot;#maxAmountPerTransac&quot; , &quot;'&quot; , &quot;).val());
				var maxAmountPerMonth = parseInt($(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonth&quot; , &quot;'&quot; , &quot;).val());
				if(maxAmountPerTransac > maxAmountPerMonth){
					thisShowError(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonthError&quot; , &quot;'&quot; , &quot;, error_maximumAmount);
					error = true;
			    }else{
			    	 thisHideError(&quot; , &quot;'&quot; , &quot;#maxAmountPerMonthError&quot; , &quot;'&quot; , &quot;);
			    }
			} */
			
			if(error == false) {
		 		$(&quot;#midPass&quot;).html($(&quot;#mid&quot;).html());
		 		$(&quot;#businessNamePass&quot;).html($(&quot;#businessName&quot;).val());
		 		$(&quot;#businessShortNamePass&quot;).html($(&quot;#businessShortName&quot;).val());
		 		$(&quot;#businessTypePass&quot;).html($(&quot;#businessType&quot;).val());
		 		$(&quot;#businessRegistrationNoPass&quot;).text($(&quot;#businessRegistrationNo&quot;).val()).html();
		 		$(&quot;#address1Pass&quot;).text($(&quot;#address1&quot;).val()).html();
		 		$(&quot;#address2Pass&quot;).text($(&quot;#address2&quot;).val()).html();
		 		$(&quot;#postcodePass&quot;).html($(&quot;#postcode&quot;).val());
		 		$(&quot;#cityPass&quot;).html($(&quot;#city&quot;).val());
		 		$(&quot;#statePass&quot;).html($(&quot;#state&quot;).val());
		 		var bizContactSplit = splitContact($(&quot;#businessContact&quot;).val());
	 			$(&quot;#businessContact_prefix&quot;).val(bizContactSplit[0]);
	 			$(&quot;#businessContact_body&quot;).val(bizContactSplit[1]);
		 		$(&quot;#businessContactPass&quot;).html($(&quot;#businessContact_prefix&quot;).val() + &quot;-&quot; + $(&quot;#businessContact_body&quot;).val());
		 		$(&quot;#companyUserLimitPass&quot;).html($(&quot;#companyUserLimit&quot;).val());
// 		 		$(&quot;#salutationPass&quot;).html($(&quot;#salutation&quot;).val());
		 		$(&quot;#fullNamePass&quot;).html($(&quot;#fullName&quot;).val());
		 		var contactSplit = splitContact($(&quot;#contact&quot;).val());
		 		$(&quot;#contact_prefix&quot;).val(contactSplit[0]);
		 		$(&quot;#contact_body&quot;).val(contactSplit[1]);
		 		$(&quot;#contactPass&quot;).html($(&quot;#contact_prefix&quot;).val() + &quot;- &quot; + $(&quot;#contact_body&quot;).val());
		 		$(&quot;#emailPass&quot;).html($(&quot;#email&quot;).val().toLowerCase());
		 		/* $(&quot;#maxAmountPerTransacPass&quot;).html($(&quot;#maxAmountPerTransac&quot;).val().replace(/\B(?=(\d{3})+(?!\d))/g, &quot;,&quot;));
		 		$(&quot;#maxAmountPerMonthPass&quot;).html($(&quot;#maxAmountPerMonth&quot;).val().replace(/\B(?=(\d{3})+(?!\d))/g, &quot;,&quot;)); */	
		 		$(&quot;#remarkPass&quot;).text($(&quot;#remark&quot;).val());	

		 		if($(&quot; , &quot;'&quot; , &quot;#useSSO&quot; , &quot;'&quot; , &quot;).is(&quot;:checked&quot;)) {
            		$(&quot; , &quot;'&quot; , &quot;#useSSOResult&quot; , &quot;'&quot; , &quot;).html(&quot;&lt;p>&lt;img src=&quot; , &quot;'&quot; , &quot;../../resources/images/icon/imgTickS.png&quot; , &quot;'&quot; , &quot; height=&quot; , &quot;'&quot; , &quot;15&quot; , &quot;'&quot; , &quot; width=&quot; , &quot;'&quot; , &quot;18&quot; , &quot;'&quot; , &quot; style=&quot; , &quot;'&quot; , &quot;margin-right:5px;&quot; , &quot;'&quot; , &quot;/>Able to perform - SSO&lt;/p>&quot;);
            	} else {
            		$(&quot; , &quot;'&quot; , &quot;#useSSOResult&quot; , &quot;'&quot; , &quot;).html(&quot;&lt;p>&lt;img src=&quot; , &quot;'&quot; , &quot;../../resources/images/icon/imgCrossS.png&quot; , &quot;'&quot; , &quot; height=&quot; , &quot;'&quot; , &quot;15&quot; , &quot;'&quot; , &quot; width=&quot; , &quot;'&quot; , &quot;15&quot; , &quot;'&quot; , &quot; style=&quot; , &quot;'&quot; , &quot;margin-right:8px;&quot; , &quot;'&quot; , &quot;/>Able to perform - SSO&lt;/p>&quot;);
            	}
		 		
		 	}else{ 
		 		$(&quot; , &quot;'&quot; , &quot;#scrollBox&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;height&quot; , &quot;'&quot; , &quot;, $(&quot; , &quot;'&quot; , &quot;#step1&quot; , &quot;'&quot; , &quot;).height());			 		
		 		return false;
		 	}
			toSubmit(options);
			$(thisClick).unbind(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;);
		}
	}
	
	
		 
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
 





	
	
		Edit Company Details
	

	
	
		
			
				 
	           	Company Details
	          	 
	          	Review &amp; Confirm
	         	 
	          	Complete
			
			
		
	

	
	
    		
	
		
		
			
				
				 	                
	                Business Details
	                Company Name
	                
	                    
	                    
	                
	                Company Short Name
	                
	                    
	                    
						(Display on application)
	                     (Maximum 25 characters)
	                    
	                    
	                
	                Type of Business
	                
	                    
	                    
	                
	                Business Registration Number (BRN)
                	
                		
                		(Optional)
                		
                	 
                	Business Registration Address
                	
                		
                	
                	
                	
                		
                		(Optional)
                		
                	
                	Region/City
                	
                		
                		
                	
                	Province
                	
                		Bangkok							
							
											Bangkok
										
											Amnat Charoen
										
											Ang Thong
										
											Ayutthaya
										
											Bueng Kan
										
											Buriram
										
											Chachoengsao
										
											Chainat
										
											Chaiyaphum
										
											Chanthaburi
										
											Chiang Mai
										
											Chiang Rai
										
											Chonburi
										
											Chumphon
										
											Kalasin
										
											Kamphaeng Phet
										
											Kanchanaburi
										
											Khon Kaen
										
											Krabi
										
											Lampang
										
											Lamphun
										
											Loei
										
											Lopburi
										
											Mae Hong Son
										
											Maha Sarakham
										
											Mukdahan
										
											Nakhon Nayok
										
											Nakhon Pathom
										
											Nakhon Phanom
										
											Nakhon Ratchasima
										
											Nakhon Sawan
										
											Nakhon Si Thammarat
										
											Nan
										
											Narathiwat
										
											Nong Bua Lamphu
										
											Nong Khai
										
											Nonthaburi
										
											Pathum Thani
										
											Pattani
										
											Phang Nga
										
											Phatthalung
										
											Phayao
										
											Phetchabun
										
											Phetchaburi
										
											Phichit
										
											Phitsanulok
										
											Phrae
										
											Phuket
										
											Prachinburi
										
											Prachuap Khiri Khan
										
											Ranong
										
											Ratchaburi
										
											Rayong
										
											Roi Et
										
											Sa Kaeo
										
											Sakon Nakhon
										
											Samut Prakan
										
											Samut Sakhon
										
											Samut Songkhram
										
											Saraburi
										
											Satun
										
											Sing Buri
										
											Sisaket
										
											Songkhla
										
											Sukhothai
										
											Suphan Buri
										
											Surat Thani
										
											Surin
										
											Tak
										
											Trang
										
											Trat
										
											Ubon Ratchathani
										
											Udon Thani
										
											Uthai Thani
										
											Uttaradit
										
											Yala
										
											Yasothon
											
						
                	
                	Postcode
                	
                		
                		
                	
                	Business Contact No.
                	
                		
                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;businessContact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;021234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;businessContact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
                		
                		
                		
                	
                	Company User Limit
                	
                		
                		
                	
	                
					
						
						Single Sign On (SSO)
						
						 	
		                		Able to perform - SSO
				         	
						
					
						
						Magstripe (MSR)
						
						 	
						 		
				         		Able to perform - MSR
				         	
						
					   
	           		
	                
	                Authoriser Details
	                Name
                	
                		
                		
                	
                	Contact No.
                	
                		
                		if (document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;08X1234567&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;contact&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
                		
                		
                		(For mobile activation code)
                		
                	
                	Email Address
                	
                		
                    	if (document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;john.doe@gmail.com&quot; , &quot;'&quot; , &quot;) document.getElementById(&quot; , &quot;'&quot; , &quot;email&quot; , &quot;'&quot; , &quot;).style.color = &quot; , &quot;'&quot; , &quot;#333333&quot; , &quot;'&quot; , &quot;;
                		(For email notifications)
                		
                	
	                
	                
	                
	                
	                
	                
	                Transactions Limit
	                Permanent Transaction Limit
	                
	                
	                THB  
	                	60000
	                	
	                
	                
	                Permanent Month Limit
	                
	                	THB  
	                	110000
	                	
	                
	                
	                
	                
	                
	                Remarks
		            Remarks
		            
		            	Test Edit by automate
		            	(Optional)
						
							Max characters: 250  remaining
						
		            	
		            
		            
	                	                
				
				
				
			   		Submit
					
				
				
			
		
		
		
			
				
				
	                Business Details
	                Company Name
                	
                	Company Short Name
	                
                	Type of Business
	                
	                Business Registration Number (BRN)
                	
                	Business Registration Address
                	
                	
                	
                	Region/City
                	
                	Province
                	
                	Postcode
                	
                	Business Contact No.
                	
                	Company User Limit
                	
	                
	                
						
						Single Sign On (SSO)
						
						 	
						
					
					
	                Authoriser Details

	                Name
                	
                	Contact No.
                	
                	Email Address
                	
	                
	                
	                
	                
	                Remarks
	                
	                
                
				
				
				
			    	Back  
			   		Confirm
					
				
				
			
		
		
		
	
	


  
  





	        	
	    
            
		
        
        
    &quot;))]</value>
      <webElementGuid>114688ff-e76d-4bd8-a23d-d13ac1df9e21</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
