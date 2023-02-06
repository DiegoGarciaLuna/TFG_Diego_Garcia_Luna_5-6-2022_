import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;




public class DatosApi {
	
	
	
	
	
	
	String []licencias= {"0BSD","AAL","Abstyles","Adobe-2006","Adobe-Glyph","ADSL","AFL-1.1","AFL-1.2","AFL-2.0","AFL-2.1","AFL-3.0","Afmparse","AGPL-1.0","AGPL-1.0-only","AGPL-1.0-or-later","AGPL-3.0","AGPL-3.0-only","AGPL-3.0-or-later","Aladdin","AMDPLPA","AML","AMPAS","ANTLR-PD","ANTLR-PD-fallback",
       "Apache-1.0","Apache-1.1","Apache-2.0","APAFML","APL-1.0","App-s2p","APSL-1.0","APSL-1.1","APSL-1.2","APSL-2.0","Arphic-1999","Artistic-1.0","Artistic-1.0-cl8","Artistic-1.0-Perl","Artistic-2.0",
       "Baekmuk","Bahyph","Barr","Beerware","BitTorrent-1.0","BitTorrent-1.1","blessing","BlueOak-1.0.0",
       "Borceux","BSD-1-Clause","BSD-2-Clause","BSD-2-Clause-FreeBSD","BSD-2-Clause-NetBSD","BSD-2-Clause-Patent","BSD-2-Clause-Views","BSD-3-Clause","BSD-3-Clause-Attribution","BSD-3-Clause-Clear","BSD-3-Clause-LBNL","BSD-3-Clause-Modification","BSD-3-Clause-No-Military-License","BSD-3-Clause-No-Nuclear-License","BSD-3-Clause-No-Nuclear-License-2014","BSD-3-Clause-No-Nuclear-Warranty","BSD-3-Clause-Open-MPI","BSD-4-Clause","BSD-4-Clause-Shortened","BSD-4-Clause-UC","BSD-Protection","BSD-Source-Code","BSL-1.0","BUSL-1.1","bzip2-1.0.5","bzip2-1.0.6","C-UDA-1.0","CAL-1.0","CAL-1.0-Combined-Work-Exception",
       "Caldera","CATOSL-1.1","CC-BY-1.0","CC-BY-2.0","CC-BY-2.5","CC-BY-2.5-AU","CC-BY-3.0","CC-BY-3.0-AT","CC-BY-3.0-DE","CC-BY-3.0-NL","CC-BY-3.0-US","CC-BY-4.0","CC-BY-NC-1.0","CC-BY-NC-2.0","CC-BY-NC-2.5","CC-BY-NC-3.0","CC-BY-NC-3.0-DE","CC-BY-NC-4.0","CC-BY-NC-ND-1.0","CC-BY-NC-ND-2.0","CC-BY-NC-ND-2.5","CC-BY-NC-ND-3.0","CC-BY-NC-ND-3.0-DE","CC-BY-NC-ND-3.0-IGO","CC-BY-NC-ND-4.0","CC-BY-NC-SA-1.0","CC-BY-NC-SA-2.0","CC-BY-NC-SA-2.0-FR","CC-BY-NC-SA-2.0-UK","CC-BY-NC-SA-2.5","CC-BY-NC-SA-3.0","CC-BY-NC-SA-3.0-DE","CC-BY-NC-SA-3.0-IGO","CC-BY-NC-SA-4.0","CC-BY-ND-1.0","CC-BY-ND-2.0","CC-BY-ND-2.5","CC-BY-ND-3.0","CC-BY-ND-3.0-DE","CC-BY-ND-4.0","CC-BY-SA-1.0","CC-BY-SA-2.0","CC-BY-SA-2.0-UK","CC-BY-SA-2.1-JP","CC-BY-SA-2.5","CC-BY-SA-3.0","CC-BY-SA-3.0-AT","CC-BY-SA-3.0-DE","CC-BY-SA-4.0","CC-PDDC","CC0-1.0",
       "CDDL-1.0","CDDL-1.1","CDL-1.0","CDLA-Permissive-1.0","CDLA-Permissive-2.0","CDLA-Sharing-1.0","CECILL-1.0","CECILL-1.1","CECILL-2.0","CECILL-2.1","CECILL-B","CECILL-C","CERN-OHL-1.1","CERN-OHL-1.2","CERN-OHL-P-2.0","CERN-OHL-S-2.0","CERN-OHL-W-2.0","ClArtistic","CNRI-Jython","CNRI-Python","CNRI-Python-GPL-Compatible","COIL-1.0","Community-Spec-1.0","Condor-1.1","copyleft-next-0.3.0","copyleft-next-0.3.1","CPAL-1.0","CPL-1.0","CPOL-1.02","Crossword","CrystalStacker","CUA-OPL-1.0","Cube","curl","D-FSL-1.0","diffmark","DL-DE-BY-2.0","DOC","Dotseqn",
       "DRL-1.0","DSDP","dvipdfm","ECL-1.0","ECL-2.0","eCos-2.0","EFL-1.0","EFL-2.0","eGenix","Elastic-2.0","Entessa","EPICS","EPL-1.0","EPL-2.0","ErlPL-1.1","etalab-2.0","EUDatagrid","EUPL-1.0","EUPL-1.1","EUPL-1.2","Eurosym","Fair","FDK-AAC","Frameworx-1.0","FreeBSD-DOC","FreeImage","FSFAP","FSFUL","FSFULLR","FTL","GD","GFDL-1.1","GFDL-1.1-invariants-only","GFDL-1.1-invariants-or-later","GFDL-1.1-no-invariants-only","GFDL-1.1-no-invariants-or-later","GFDL-1.1-only","GFDL-1.1-or-later",
       "GFDL-1.2","GFDL-1.2-invariants-only","GFDL-1.2-invariants-or-later", "GFDL-1.2-no-invariants-only","GFDL-1.2-no-invariants-or-later","GFDL-1.2-only",
       "GFDL-1.2-or-later","GFDL-1.3","GFDL-1.3-invariants-only","GFDL-1.3-invariants-or-later","GFDL-1.3-no-invariants-only","GFDL-1.3-no-invariants-or-later","GFDL-1.3-only","GFDL-1.3-or-later","Giftware","GL2PS","Glide","Glulxe","GLWTPL","gnuplot","GPL-1.0","GPL-1.0-only","GPL-1.0-or-later","GPL-1.0+","GPL-2.0","GPL-2.0-only","GPL-2.0-or-later","GPL-2.0-with-autoconf-exception","GPL-2.0-with-bison-exception","GPL-2.0-with-classpath-exception",
       "GPL-2.0-with-font-exception","GPL-2.0-with-GCC-exception","GPL-2.0+","GPL-3.0","GPL-3.0-only","GPL-3.0-or-later","GPL-3.0-with-autoconf-exception","GPL-3.0-with-GCC-exception","GPL-3.0+","gSOAP-1.3b","HaskellReport","Hippocratic-2.1","HPND","HPND-sell-variant","HTMLTIDY","IBM-pibs","ICU","IJG","ImageMagick","iMatix","Imlib2","Info-ZIP","Intel","Intel-ACPI","Interbase-1.0","IPA","IPL-1.0","ISC","Jam","JasPer-2.0","JPNIC","JSON","KiCad-libraries-exception","LAL-1.2","LAL-1.3","Latex2e","Leptonica","LGPL-2.0","LGPL-2.0-only",
       "LGPL-2.0-or-later","LGPL-2.0+","LGPL-2.1","LGPL-2.1-only","LGPL-2.1-or-later","LGPL-2.1+","LGPL-3.0","LGPL-3.0-only","LGPL-3.0-or-later","LGPL-3.0+","LGPLLR","Libpng","libpng-2.0","libselinux-1.0","libtiff",
       "LiLiQ-P-1.1","LiLiQ-R-1.1","LiLiQ-Rplus-1.1","Linux-man-pages-copyleft","Linux-OpenIB","LPL-1.0","LPL-1.02","LPPL-1.0","LPPL-1.1","LPPL-1.2","LPPL-1.3a","LPPL-1.3c","MakeIndex","MirOS","MIT","MIT-0","MIT-advertising","MIT-CMU","MIT-enna","MIT-feh","MIT-Modern-Variant","MIT-open-group","MITNFA","Motosoto","mpich2","MPL-1.0","MPL-1.1","MPL-2.0","MPL-2.0-no-copyleft-exception","mplus","MS-PL","MS-RL","MTLL","MulanPSL-1.0","MulanPSL-2.0","Multics","Mup","NAIST-2003","NASA-1.3","Naumen","NBPL-1.0","NCGL-UK-2.0","NCSA","Net-SNMP","NetCDF","Newsletr","NGPL","NIST-PD","NIST-PD-fallback","NLOD-1.0","NLOD-2.0","NLPL","Nokia","NOSL","Noweb","NPL-1.0","NPL-1.1","NPOSL-3.0","NRL","NTP","NTP-0",
       "Nunit","O-UDA-1.0","OCCT-PL","OCLC-2.0","ODbL-1.0","ODC-By-1.0","OFL-1.0","OFL-1.0-no-RFN","OFL-1.0-RFN","OFL-1.1","OFL-1.1-no-RFN","OFL-1.1-RFN","OGC-1.0","OGDL-Taiwan-1.0","OGL-Canada-2.0","OGL-UK-1.0","OGL-UK-2.0","OGL-UK-3.0","OGTSL","OLDAP-1.1","OLDAP-1.2","OLDAP-1.3","OLDAP-1.4","OLDAP-2.0","OLDAP-2.0.1","OLDAP-2.1","OLDAP-2.2","OLDAP-2.2.1","OLDAP-2.2.2","OLDAP-2.3","OLDAP-2.4","OLDAP-2.5","OLDAP-2.6","OLDAP-2.7","OLDAP-2.8","OML","OpenSSL","OPL-1.0","OPUBL-1.0",
       "OSET-PL-2.1","OSL-1.0","OSL-1.1","OSL-2.0","OSL-2.1","OSL-3.0","Parity-6.0.0","Parity-7.0.0","PDDL-1.0","PHP-3.0","PHP-3.01","Plexus","PolyForm-Noncommercial-1.0.0","PolyForm-Small-Business-1.0.0","PostgreSQL","PSF-2.0","psfrag","psutils","Python-2.0","Qhull","QPL-1.0",
       "Rdisc","RHeCos-1.1","RPL-1.1","RPL-1.5","RPSL-1.0","RSA-MD","RSCPL","Ruby","SAX-PD","Saxpath","SCEA","SchemeReport","Sendmail","Sendmail-8.23","SGI-B-1.0","SGI-B-1.1","SGI-B-2.0","SHL-0.5","SHL-0.51","SimPL-2.0","SISSL","SISSL-1.2","Sleepycat","SMLNJ","SMPPL","SNIA","Spencer-86","Spencer-94","Spencer-99","SPL-1.0","SSH-OpenSSH","SSH-short","SSPL-1.0","StandardML-NJ",
       "SugarCRM-1.1.3","SWL","TAPR-OHL-1.0","TCL","TCP-wrappers","TMate","TORQUE-1.1","TOSL","TU-Berlin-1.0","TU-Berlin-2.0","UCL-1.0","Unicode-DFS-2015","Unicode-DFS-2016","Unicode-TOU","Unlicense","UPL-1.0","Vim","VOSTROM","VSL-1.0","W3C","W3C-19980720","W3C-20150513","Watcom-1.0","Wsuipa","WTFPL","wxWindows","X11","X11-distribute-modifications-variant",
       "Xerox","XFree86-1.1","xinetd","Xnet","xpp","XSkat","YPL-1.0","YPL-1.1","Zed","Zend-2.0","Zimbra-1.3","Zimbra-1.4","Zlib","zlib-acknowledgement","ZPL-1.1","ZPL-2.0","ZPL-2.1","by/4.0","odc-by","cc-by","by/3.0","llicencia-oberta-informacio-catalunya","dadesobertes.l-h.cat/obrefitxer","opendatalapalma.es/pages/avisolegal"};
	
	String []meses= {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
	String []meslet= {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"};
	
	String [] form1 = {"pdf", "html","png","jpg"};
	String [] form2 = {"csv", "excell","excel", "xlsx","txt","tsv","xls"};
	String [] form3 = {"xml", "kml", "rdf", "json","jsonld"};
	
	 
	String[] paraGeo= {"https://datosabiertos.rivasciudad.es/dataset/0c977161-ac30-4b3e-ae85-8be98ad35e9d/resource/523c8d92-6e38-47b1-9cb9-6b5060d09414/download/recurso.json", "https://dipcas.opendatasoft.com/api/v2/catalog/datasets/planeamiento-urbanistico/exports/jsonl","https://analisi.transparenciacatalunya.cat/api/views/uq9g-cc59/rows.json?accessType=DOWNLOAD", "https://opendata.l-h.cat/resource/eaz9-6ynn.json", "https://services.arcgis.com/hkQNLKNeDVYBjvFE/arcgis/rest/services/Perimetro_incendio_veg_2016/FeatureServer/0", "https://opendata.arcgis.com/datasets/9e6e941d359f49169275318f9e852962_0.geojson", "https://opendata.arcgis.com/datasets/b62d1f0201da44acad4c2b15921940c2_0.geojson", "https://do.diba.cat/api/dataset/exposicions/format/json", "http://do.diba.cat/api/dataset/actesdiba_ca/format/json", "http://do.diba.cat/api/dataset/agendageneral_ca/format/json"};
   
	

	
	
	public int[] datos (String g) {
	
		int formatoo=0;
		int licenciaa=0;
		int geoo=0;
		int frecc=0;
		int vancuatro []= {formatoo, licenciaa, geoo, frecc};
		
		try {
			
		
		
	     String url = g;
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     // optional default is GET
	    
	     //add request header
	     
	     int responseCode = con.getResponseCode();
	     //System.out.println("\nSending 'GET' request to URL : " + url);
	     //System.out.println("Response Code : " + responseCode);
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();
	     while ((inputLine = in.readLine()) != null) {
	     	response.append(inputLine);
	     }in.close();
	     //print in String
	  
	     //Read JSON response and print
	    
	     JSONObject myresponse = new JSONObject(response.toString());
	     JSONObject result = new JSONObject(myresponse.getJSONObject("result").toString());
	    
	    JSONArray ovs= result.getJSONArray("items");
	    JSONObject resultados=ovs.getJSONObject(0);
	  
	    
	    int formatooo=1;
	    
	    
	   
	   try {
		   
		   
		   if(resultados.has("distribution")) {
			 
	   JSONArray form= resultados.getJSONArray("distribution");
	   for(int i=0;i<form.length();i++) {
	    JSONObject formato=form.getJSONObject(i);
	    JSONObject format = new JSONObject(formato.getJSONObject("format").toString());
	    
	   
	  
	   String evaluarTech= format.getString("value").replace("text/", "");
	  if(formatooo<3) {
	   for(int t=0; t< form3.length; t++) {
		   if(evaluarTech.contains(form3[t])) {
			   formatooo=3;
			   
		   }
	   }
	   
	   if(formatooo<2) {
	   for(int t=0; t< form2.length; t++) {
		   if(evaluarTech.contains(form2[t])) {
			   formatooo=2;
			   
		   }
	   }if(formatooo<=1) {
	   for(int t=0; t< form1.length; t++) {
		   if(evaluarTech.contains(form1[t])) {
			   formatooo=1;
			   
		   }
	   }
	   }
	   }
	  }
	   }
		   }else {
			   formatooo=1;
			  
		   }
	   }catch (Exception e) {
			System.out.println(e);
	   }  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   int licenciaaa=1;
	   
	   
	   try {
		   
		   if(resultados.has("license"))   {
		   
	   String evaluarLic= resultados.getString("license");
	   for(int i=0; i< licencias.length; i++) {
		   if(evaluarLic.contains(licencias[i])) {
			   licenciaaa=3;
			  evaluarLic="3";
			   
		   }
	   }
	   
	   if(evaluarLic != "3") {
		   licenciaaa=1;
		 
	   }
		   }else {
			   licenciaaa=1;
			
		   }
	   }catch (Exception e) {
			System.out.println(e);
	   } 
	   
	   
	   

	   
	   
	   
	   int freccc=1;
	   
	   
	   
	   try {
		   
	  
		if(resultados.has("modified"))   {
			
	   String evaluarFrec=resultados.getString("modified");
	   String nuevoFrec="";
	   String lafrec="";
    
	   
	   
	   for (int j=0;j<meslet.length;j++) {
		   if(evaluarFrec.contains(meslet[j])) {
				   nuevoFrec=evaluarFrec.replace(meslet[j], meses[j]);
				   lafrec= nuevoFrec.substring(5, 25);
				   break;
		   }
	   }
	   
	   
	
	   
	 
	   
	   
	   String antiguoForm = "dd MM yyyy hh:mm:ss"; 
	    String nuevoForm = "yyyy-MM-dd-hh:mm:ss";
	    String nuevoDateString;

	    

	    SimpleDateFormat sdf = new SimpleDateFormat(antiguoForm); 
	    Date fecha = sdf.parse(lafrec); 
	    sdf.applyPattern(nuevoForm); 
	    nuevoDateString = sdf.format(fecha);
	    
	    
	

	   String tiempoahora= LocalDateTime.now().toString();
	   String cambio= tiempoahora.replace("T", "-");
	   String ahora= cambio.substring(0, 19);
	  
	   
	   Date primerDate = sdf.parse(nuevoDateString);
       Date segundoDate = sdf.parse(ahora);

       long diff = segundoDate.getTime() - primerDate.getTime();
       

       TimeUnit time = TimeUnit.DAYS; 
       long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
       if (diffrence>30) {
    	   freccc=1;
    	 
       }else if(diffrence<30 && diffrence>=1) {
    	   freccc=2;
    	  
       }else {
    	   freccc=3;
    	  
       }
	   
		}else {
			freccc=1;
			
		}
	   }catch (Exception e) {
			//System.out.println(e);
	   } 
    	  
      
	   
	  int geooo=1;
	  try {
		 
		  String evaluarTech="";
		  
		  if(resultados.has("distribution")) {
			 
			   JSONArray form= resultados.getJSONArray("distribution");
			   
			   for(int i=0;i<form.length();i++) {
			    JSONObject formato =form.getJSONObject(i);
			    JSONObject format = new JSONObject(formato.getJSONObject("format").toString());
			    
			    if(format.getString("value").contains("application/json")) {
			 
			   evaluarTech= formato.getString("accessURL");
			   
			    }
			    
			    }
			   for(int t=0;t<paraGeo.length;t++) {
				    if(evaluarTech.contains(paraGeo[t])) {
				    	geooo=3;
				    }
			  }
		  
		  }else if(resultados.has("spatial")) {
			   
			   
			  
			   geooo=2;
			   
		   }else {
			   geooo=1;
			  
		   }
		   
		   
			
			 
			 
		   
		   
	   }catch (Exception e) {
			System.out.println(e);
		}
       
	  
	   vancuatro[0]=licenciaaa;
	   vancuatro[1]=geooo;
	   vancuatro[2]=freccc;
	   vancuatro[3]=formatooo;

	   
	   
	   
	  
		}catch (Exception e) {
			System.out.println(e);
		} return vancuatro;
		
		
	
	}
	
	
	
		
		
            
        }
    

