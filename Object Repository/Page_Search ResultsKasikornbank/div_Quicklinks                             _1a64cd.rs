<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Quicklinks                             _1a64cd</name>
   <tag></tag>
   <elementGuidId>32b8acbe-520a-4769-876f-61f7bac2187c</elementGuidId>
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
      <webElementGuid>fbf4a352-ce5c-478d-a466-e6a0e65f8419</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>center960</value>
      <webElementGuid>f296f8db-628e-462b-9adc-8bebb5800aac</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Staff Summary



	Add a Staff





	Terminal Summary





	Register a set of Terminals



	K SHOP Staff Summary



	K SHOP Terminal Summary


		            
		        
		        
		        
	        
	
			
	        
	        	

function searchBlank()
{
	if(document.getElementById('search').value=='')
	{
		document.getElementById('search').value = 'Terminal ID (TID) / Staff Name';
	}
}





	
	
		
			
				
					Search
				 
				
			
			
				
						
					
				
					if (document.getElementById('search').value != 'Terminal ID (TID) / Staff Name') 
						document.getElementById('search').style.color = &quot;#333333&quot;;
					
			
			
				
					Search for a Terminal
				
			
			
		
	
	


	
		
		
			Export CSV files
			
		
		
	


	Search Results



	
		
		
			You are currently viewing Terminal ID (TID) / Staff Name
			11111111
		
		
	
	

	Total Records: 7
    
    	
			 
		

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

	
		
		
	    
	    	
						Terminal ID (TID)
					
							Staff Name
						
							Activation Date/Created Date
						
						Company Name
					
	    
	    
		
			
			
			
				
							
							
							74734538
						
					
				
							 
							
							pun2811111111
						
					
				
							 
							
							28 Dec 2017 /28 Dec 2017
						
					
				
							 
							
							SRISIRILUK TAITHONGCHAI(401041197769001)
						
					
				
			
			
		
			
			
			
				
							
							
							74734537
						
					
				
							 
							
							pun2811111111
						
					
				
							 
							
							28 Dec 2017 /28 Dec 2017
						
					
				
							 
							
							SRISIRILUK TAITHONGCHAI(401010195742001)
						
					
				
			
			
		
			
			
			
				
							
							
							74623694
						
					
				
							 
							
							111111111aa
						
					
				
							 
							
							21 Sep 2016 /21 Sep 2016
						
					
				
							 
							
							INULAI PETKWAK(401003528633001)
						
					
				
			
			
		
			
			
			
				
							
							
							74569675
						
					
				
							 
							
							11111111
						
					
				
							 
							
							01 Mar 2016 /01 Mar 2016
						
					
				
							 
							
							KHAMPINAN TANTEIL(401040239851001)
						
					
				
			
			
		
			
			
			
				
							
							
							74569672
						
					
				
							 
							
							11111111
						
					
				
							 
							
							01 Mar 2016 /01 Mar 2016
						
					
				
							 
							
							KHAMPINAN TANTEIL(401003245667001)
						
					
				
			
			
		
			
			
			
				
							
							
							74553010
						
					
				
							 
							
							sayamon11111111
						
					
				
							 
							
							03 Dec 2015 /03 Dec 2015
						
					
				
							 
							
							PHUTTHAMETHA PILA(401040181642001)
						
					
				
			
			
		
			
			
			
				
							
							
							74552956
						
					
				
							 
							
							sayamon11111111
						
					
				
							 
							
							03 Dec 2015 /03 Dec 2015
						
					
				
							 
							
							PHUTTHAMETHA PILA(401003148441001)
						
					
				
			
			
		
	
	
	        	
	    
            
		
        
        </value>
      <webElementGuid>1eee54a4-b448-44e6-9940-0239e78e996b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;mainContainer&quot;)/div[@class=&quot;center960&quot;]</value>
      <webElementGuid>21b1835e-28b1-43ef-8213-8a6173d91257</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='mainContainer']/div</value>
      <webElementGuid>9e01a102-b072-465c-9591-b4b453a4b127</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Administrator'])[1]/following::div[3]</value>
      <webElementGuid>6c4f8f01-7c7c-4b7d-bc1d-734bd05ff24b</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='ManageCredit Settlements'])[1]/following::div[3]</value>
      <webElementGuid>127e76e7-ab81-4afc-affb-77c7e0f52104</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[4]/div</value>
      <webElementGuid>68caf42b-3ece-47cd-a305-f5edf11f6dba</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Staff Summary



	Add a Staff





	Terminal Summary





	Register a set of Terminals



	K SHOP Staff Summary



	K SHOP Terminal Summary


		            
		        
		        
		        
	        
	
			
	        
	        	

function searchBlank()
{
	if(document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value==&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)
	{
		document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;Terminal ID (TID) / Staff Name&quot; , &quot;'&quot; , &quot;;
	}
}





	
	
		
			
				
					Search
				 
				
			
			
				
						
					
				
					if (document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;Terminal ID (TID) / Staff Name&quot; , &quot;'&quot; , &quot;) 
						document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).style.color = &quot;#333333&quot;;
					
			
			
				
					Search for a Terminal
				
			
			
		
	
	


	
		
		
			Export CSV files
			
		
		
	


	Search Results



	
		
		
			You are currently viewing Terminal ID (TID) / Staff Name
			11111111
		
		
	
	

	Total Records: 7
    
    	
			 
		

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

	
		
		
	    
	    	
						Terminal ID (TID)
					
							Staff Name
						
							Activation Date/Created Date
						
						Company Name
					
	    
	    
		
			
			
			
				
							
							
							74734538
						
					
				
							 
							
							pun2811111111
						
					
				
							 
							
							28 Dec 2017 /28 Dec 2017
						
					
				
							 
							
							SRISIRILUK TAITHONGCHAI(401041197769001)
						
					
				
			
			
		
			
			
			
				
							
							
							74734537
						
					
				
							 
							
							pun2811111111
						
					
				
							 
							
							28 Dec 2017 /28 Dec 2017
						
					
				
							 
							
							SRISIRILUK TAITHONGCHAI(401010195742001)
						
					
				
			
			
		
			
			
			
				
							
							
							74623694
						
					
				
							 
							
							111111111aa
						
					
				
							 
							
							21 Sep 2016 /21 Sep 2016
						
					
				
							 
							
							INULAI PETKWAK(401003528633001)
						
					
				
			
			
		
			
			
			
				
							
							
							74569675
						
					
				
							 
							
							11111111
						
					
				
							 
							
							01 Mar 2016 /01 Mar 2016
						
					
				
							 
							
							KHAMPINAN TANTEIL(401040239851001)
						
					
				
			
			
		
			
			
			
				
							
							
							74569672
						
					
				
							 
							
							11111111
						
					
				
							 
							
							01 Mar 2016 /01 Mar 2016
						
					
				
							 
							
							KHAMPINAN TANTEIL(401003245667001)
						
					
				
			
			
		
			
			
			
				
							
							
							74553010
						
					
				
							 
							
							sayamon11111111
						
					
				
							 
							
							03 Dec 2015 /03 Dec 2015
						
					
				
							 
							
							PHUTTHAMETHA PILA(401040181642001)
						
					
				
			
			
		
			
			
			
				
							
							
							74552956
						
					
				
							 
							
							sayamon11111111
						
					
				
							 
							
							03 Dec 2015 /03 Dec 2015
						
					
				
							 
							
							PHUTTHAMETHA PILA(401003148441001)
						
					
				
			
			
		
	
	
	        	
	    
            
		
        
        &quot;) or . = concat(&quot;
    
	    
	    	
			    
		        	Quicklinks
		        
		        
		        	
		            


	Staff Summary



	Add a Staff





	Terminal Summary





	Register a set of Terminals



	K SHOP Staff Summary



	K SHOP Terminal Summary


		            
		        
		        
		        
	        
	
			
	        
	        	

function searchBlank()
{
	if(document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value==&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)
	{
		document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;Terminal ID (TID) / Staff Name&quot; , &quot;'&quot; , &quot;;
	}
}





	
	
		
			
				
					Search
				 
				
			
			
				
						
					
				
					if (document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).value != &quot; , &quot;'&quot; , &quot;Terminal ID (TID) / Staff Name&quot; , &quot;'&quot; , &quot;) 
						document.getElementById(&quot; , &quot;'&quot; , &quot;search&quot; , &quot;'&quot; , &quot;).style.color = &quot;#333333&quot;;
					
			
			
				
					Search for a Terminal
				
			
			
		
	
	


	
		
		
			Export CSV files
			
		
		
	


	Search Results



	
		
		
			You are currently viewing Terminal ID (TID) / Staff Name
			11111111
		
		
	
	

	Total Records: 7
    
    	
			 
		

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

	
		
		
	    
	    	
						Terminal ID (TID)
					
							Staff Name
						
							Activation Date/Created Date
						
						Company Name
					
	    
	    
		
			
			
			
				
							
							
							74734538
						
					
				
							 
							
							pun2811111111
						
					
				
							 
							
							28 Dec 2017 /28 Dec 2017
						
					
				
							 
							
							SRISIRILUK TAITHONGCHAI(401041197769001)
						
					
				
			
			
		
			
			
			
				
							
							
							74734537
						
					
				
							 
							
							pun2811111111
						
					
				
							 
							
							28 Dec 2017 /28 Dec 2017
						
					
				
							 
							
							SRISIRILUK TAITHONGCHAI(401010195742001)
						
					
				
			
			
		
			
			
			
				
							
							
							74623694
						
					
				
							 
							
							111111111aa
						
					
				
							 
							
							21 Sep 2016 /21 Sep 2016
						
					
				
							 
							
							INULAI PETKWAK(401003528633001)
						
					
				
			
			
		
			
			
			
				
							
							
							74569675
						
					
				
							 
							
							11111111
						
					
				
							 
							
							01 Mar 2016 /01 Mar 2016
						
					
				
							 
							
							KHAMPINAN TANTEIL(401040239851001)
						
					
				
			
			
		
			
			
			
				
							
							
							74569672
						
					
				
							 
							
							11111111
						
					
				
							 
							
							01 Mar 2016 /01 Mar 2016
						
					
				
							 
							
							KHAMPINAN TANTEIL(401003245667001)
						
					
				
			
			
		
			
			
			
				
							
							
							74553010
						
					
				
							 
							
							sayamon11111111
						
					
				
							 
							
							03 Dec 2015 /03 Dec 2015
						
					
				
							 
							
							PHUTTHAMETHA PILA(401040181642001)
						
					
				
			
			
		
			
			
			
				
							
							
							74552956
						
					
				
							 
							
							sayamon11111111
						
					
				
							 
							
							03 Dec 2015 /03 Dec 2015
						
					
				
							 
							
							PHUTTHAMETHA PILA(401003148441001)
						
					
				
			
			
		
	
	
	        	
	    
            
		
        
        &quot;))]</value>
      <webElementGuid>b812731b-9b4b-479a-9ff8-bc4629ab6564</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
