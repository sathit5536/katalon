<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Quicklinks                             _0e9c49</name>
   <tag></tag>
   <elementGuidId>74145bb9-fe3d-4534-a314-608721d96ac2</elementGuidId>
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
      <webElementGuid>490e6161-415b-4818-a012-7b74f6bad1f8</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>mainContainer</value>
      <webElementGuid>d039e5ec-473b-4b3e-92e1-d885c502d2a7</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Staff Summary


		            
		        
		        
		        
	        
	
			
	        
	        	

function searchBlank()
{
	if(document.getElementById('search').value=='')
	{
		document.getElementById('search').value = 'Staff Name';
	}
}




	
	
		
			
				
					Search
				 
				
			
			
				
						
					
				
					if (document.getElementById('search').value != 'Staff Name') 
						document.getElementById('search').style.color = &quot;#333333&quot;;
				
			
			
				
					Search for a Staff
				
			
			
		
	
	


	
		
		
			Export to CSV
           	
		
		
	



	All Staffs



        
            
            
            	
                
		
				
							Status
							
								Select One
									Select One
									
												
													Active
												
											
												
													Suspended
												
											
								
							
							
						
							Date
							
								
								  to 
								
							
							
						
		           	
                    
                        Search
                        
                    
		            

            		
            	
        		
            
            
        
        

	Total Records: 2
    
    	
			 
		

        Page 1 of 1	
                
        
			 
		
	
    

            



    $(document).ready(function() {
     
        $(&quot;.remark&quot;).shorten({
            &quot;showChars&quot; : 80,
            &quot;moreText&quot; : &quot;>>&quot;,
            &quot;lessText&quot; : &quot;&lt;&lt;&quot;
        });
     
    });


function updateTo(id,role,current)
{
	if(role==&quot;Admin&quot;)
	{
		document.getElementById('radioUser_'+id).className = &quot;role&quot;;	
		document.getElementById('radioAdmin_'+id).className = &quot;roleSelect&quot;;		
	}else{
		document.getElementById('radioAdmin_'+id).className = &quot;role&quot;;	
		document.getElementById('radioUser_'+id).className = &quot;roleSelect&quot;;	
	}
	document.getElementById('update_'+id).href = &quot;updateRole?id=&quot;+id+&quot;&amp;role=&quot;+role;
	document.getElementById('update_'+id).className = &quot;fancybox fancybox.iframe buttonMG&quot;;
	
	if(current==role){document.getElementById('update_'+id).style.display = &quot;none&quot;;}
	else{document.getElementById('update_'+id).style.display = &quot;block&quot;;}
	
  return false;
}

	
		
		
	    
	    	
						Staff Name
					
							Name
						
							TID
						
							Status
						
							Activation Date/Created Date
						
						Quicklink
					
	    
	    
		
			
			
			
				
							
							
							KB000000512534001
						
					
				
							 
							
							เทสเอ็มพอสหนึ่ง
						
					
				
							 
							
							43000094
						
					
				
							 
							
							Active
						
					
				
							 
							
							16 Feb 2023 /19 Jun 2020
						
					
				
							 
						
							
				            	
								
									
										Select One
									
										View Details
									
										Suspend Staff Access
									
								Select One
				                
				                
				                	
				                		Go
				                	
				                    
				                
				            	
				            	
									
								
										
						
					
				
			
			
		
			
			
			
				
							
							
							KB000000512534
						
					
				
							 
							
							บังใบเจริญสาม
						
					
				
							 
							
							43000071
						
					
				
							 
							
							Active
						
					
				
							 
							
							20 Jan 2022 /17 Jun 2020
						
					
				
							 
						
							
				            	
								
									
										Select One
									
										View Details
									
										Suspend Staff Access
									
								Select One
				                
				                
				                	
				                		Go
				                	
				                    
				                
				            	
				            	
									
								
										
						
					
				
			
			
		
	
	
	        	
	    
            
		
        
        
    </value>
      <webElementGuid>3c24ae4c-7687-490f-b05a-f307c6acf80d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;mainContainer&quot;)</value>
      <webElementGuid>1009681a-a018-43e4-80b4-c65de69b66db</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='mainContainer']</value>
      <webElementGuid>c7dc02e7-c611-439f-accb-453aaa363b75</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='topContainer']/div[4]</value>
      <webElementGuid>9a5c3dc6-7617-4ee7-8b08-cc5b8e7b9f10</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Support'])[1]/following::div[2]</value>
      <webElementGuid>11a4f0f4-84e0-4f77-bbf7-88bc8b678255</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Settings'])[1]/following::div[2]</value>
      <webElementGuid>5df608f0-ebd4-4c0d-b144-83e1479d2d8d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[4]</value>
      <webElementGuid>27595614-b088-4dd9-8b03-a8f630cb2e5f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'mainContainer' and (text() = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Staff Summary


		            
		        
		        
		        
	        
	
			
	        
	        	

function searchBlank()
{
	if(document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value==&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)
	{
		document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;Staff Name&quot; , &quot;'&quot; , &quot;;
	}
}




	
	
		
			
				
					Search
				 
				
			
			
				
						
					
				
					if (document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;Staff Name&quot; , &quot;'&quot; , &quot;) 
						document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).style.color = &quot;#333333&quot;;
				
			
			
				
					Search for a Staff
				
			
			
		
	
	


	
		
		
			Export to CSV
           	
		
		
	



	All Staffs



        
            
            
            	
                
		
				
							Status
							
								Select One
									Select One
									
												
													Active
												
											
												
													Suspended
												
											
								
							
							
						
							Date
							
								
								  to 
								
							
							
						
		           	
                    
                        Search
                        
                    
		            

            		
            	
        		
            
            
        
        

	Total Records: 2
    
    	
			 
		

        Page 1 of 1	
                
        
			 
		
	
    

            



    $(document).ready(function() {
     
        $(&quot;.remark&quot;).shorten({
            &quot;showChars&quot; : 80,
            &quot;moreText&quot; : &quot;>>&quot;,
            &quot;lessText&quot; : &quot;&lt;&lt;&quot;
        });
     
    });


function updateTo(id,role,current)
{
	if(role==&quot;Admin&quot;)
	{
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioUser_&quot; , &quot;'&quot; , &quot;+id).className = &quot;role&quot;;	
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioAdmin_&quot; , &quot;'&quot; , &quot;+id).className = &quot;roleSelect&quot;;		
	}else{
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioAdmin_&quot; , &quot;'&quot; , &quot;+id).className = &quot;role&quot;;	
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioUser_&quot; , &quot;'&quot; , &quot;+id).className = &quot;roleSelect&quot;;	
	}
	document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).href = &quot;updateRole?id=&quot;+id+&quot;&amp;role=&quot;+role;
	document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).className = &quot;fancybox fancybox.iframe buttonMG&quot;;
	
	if(current==role){document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).style.display = &quot;none&quot;;}
	else{document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).style.display = &quot;block&quot;;}
	
  return false;
}

	
		
		
	    
	    	
						Staff Name
					
							Name
						
							TID
						
							Status
						
							Activation Date/Created Date
						
						Quicklink
					
	    
	    
		
			
			
			
				
							
							
							KB000000512534001
						
					
				
							 
							
							เทสเอ็มพอสหนึ่ง
						
					
				
							 
							
							43000094
						
					
				
							 
							
							Active
						
					
				
							 
							
							16 Feb 2023 /19 Jun 2020
						
					
				
							 
						
							
				            	
								
									
										Select One
									
										View Details
									
										Suspend Staff Access
									
								Select One
				                
				                
				                	
				                		Go
				                	
				                    
				                
				            	
				            	
									
								
										
						
					
				
			
			
		
			
			
			
				
							
							
							KB000000512534
						
					
				
							 
							
							บังใบเจริญสาม
						
					
				
							 
							
							43000071
						
					
				
							 
							
							Active
						
					
				
							 
							
							20 Jan 2022 /17 Jun 2020
						
					
				
							 
						
							
				            	
								
									
										Select One
									
										View Details
									
										Suspend Staff Access
									
								Select One
				                
				                
				                	
				                		Go
				                	
				                    
				                
				            	
				            	
									
								
										
						
					
				
			
			
		
	
	
	        	
	    
            
		
        
        
    &quot;) or . = concat(&quot;
        
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Staff Summary


		            
		        
		        
		        
	        
	
			
	        
	        	

function searchBlank()
{
	if(document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value==&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)
	{
		document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;Staff Name&quot; , &quot;'&quot; , &quot;;
	}
}




	
	
		
			
				
					Search
				 
				
			
			
				
						
					
				
					if (document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;Staff Name&quot; , &quot;'&quot; , &quot;) 
						document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).style.color = &quot;#333333&quot;;
				
			
			
				
					Search for a Staff
				
			
			
		
	
	


	
		
		
			Export to CSV
           	
		
		
	



	All Staffs



        
            
            
            	
                
		
				
							Status
							
								Select One
									Select One
									
												
													Active
												
											
												
													Suspended
												
											
								
							
							
						
							Date
							
								
								  to 
								
							
							
						
		           	
                    
                        Search
                        
                    
		            

            		
            	
        		
            
            
        
        

	Total Records: 2
    
    	
			 
		

        Page 1 of 1	
                
        
			 
		
	
    

            



    $(document).ready(function() {
     
        $(&quot;.remark&quot;).shorten({
            &quot;showChars&quot; : 80,
            &quot;moreText&quot; : &quot;>>&quot;,
            &quot;lessText&quot; : &quot;&lt;&lt;&quot;
        });
     
    });


function updateTo(id,role,current)
{
	if(role==&quot;Admin&quot;)
	{
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioUser_&quot; , &quot;'&quot; , &quot;+id).className = &quot;role&quot;;	
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioAdmin_&quot; , &quot;'&quot; , &quot;+id).className = &quot;roleSelect&quot;;		
	}else{
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioAdmin_&quot; , &quot;'&quot; , &quot;+id).className = &quot;role&quot;;	
		document.getElementById(&quot; , &quot;'&quot; , &quot;radioUser_&quot; , &quot;'&quot; , &quot;+id).className = &quot;roleSelect&quot;;	
	}
	document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).href = &quot;updateRole?id=&quot;+id+&quot;&amp;role=&quot;+role;
	document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).className = &quot;fancybox fancybox.iframe buttonMG&quot;;
	
	if(current==role){document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).style.display = &quot;none&quot;;}
	else{document.getElementById(&quot; , &quot;'&quot; , &quot;update_&quot; , &quot;'&quot; , &quot;+id).style.display = &quot;block&quot;;}
	
  return false;
}

	
		
		
	    
	    	
						Staff Name
					
							Name
						
							TID
						
							Status
						
							Activation Date/Created Date
						
						Quicklink
					
	    
	    
		
			
			
			
				
							
							
							KB000000512534001
						
					
				
							 
							
							เทสเอ็มพอสหนึ่ง
						
					
				
							 
							
							43000094
						
					
				
							 
							
							Active
						
					
				
							 
							
							16 Feb 2023 /19 Jun 2020
						
					
				
							 
						
							
				            	
								
									
										Select One
									
										View Details
									
										Suspend Staff Access
									
								Select One
				                
				                
				                	
				                		Go
				                	
				                    
				                
				            	
				            	
									
								
										
						
					
				
			
			
		
			
			
			
				
							
							
							KB000000512534
						
					
				
							 
							
							บังใบเจริญสาม
						
					
				
							 
							
							43000071
						
					
				
							 
							
							Active
						
					
				
							 
							
							20 Jan 2022 /17 Jun 2020
						
					
				
							 
						
							
				            	
								
									
										Select One
									
										View Details
									
										Suspend Staff Access
									
								Select One
				                
				                
				                	
				                		Go
				                	
				                    
				                
				            	
				            	
									
								
										
						
					
				
			
			
		
	
	
	        	
	    
            
		
        
        
    &quot;))]</value>
      <webElementGuid>216b19d7-3b1d-4168-895c-ea2f473c93ae</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
