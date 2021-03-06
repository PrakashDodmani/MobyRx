
package com.MobyRx.java.service;
import com.MobyRx.java.bl.CommonBL;
import com.MobyRx.java.service.wso.UserWSO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;


/**
 * Created by IntelliJ IDEA.
 * User: uday chandu G N
 * Date: 9/5/16
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
@Path("/MobyRx/Prescription")
@Transactional
public class PrescriptionService extends BaseService{
	 private Logger logger = LoggerFactory.getLogger(PrescriptionService.class);

	    private CommonBL commonBL;

	    @Autowired(required = true)
	    public void setCommonBL(CommonBL commonBL) {
	        this.commonBL = commonBL;
	    }
	    
	    @POST
	    @Path("/Create")
	    public Response create( @Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    
	    @GET
	    @Path("/GetPrescriptionByPatientId")
	    public Response getPrescriptionByPatientId(@Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    
	    @GET
	    @Path("/GetPrescriptionByPatientToken")
	    public Response getPrescriptionByPatientToken(@Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    @GET
	    @Path("/GetPrescriptionByDoctorId")
	    public Response getPrescriptionByDoctorId(@Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    @GET
	    @Path("/GetPrescriptionByDependentId")
	    public Response getPrescriptionByDependentId(@Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    @GET
	    @Path("/GetPrescriptionByDoctorIdDate")
	    public Response getPrescriptionByDoctorIdDate(@Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    @GET
	    @Path("/GetPrescriptionByPrescriptionId")
	    public Response getPrescriptionByPrescriptionId(@Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    @GET
	    @Path("/GetPatientOrderByPrescriptionId")
	    public Response getPatientOrderByPrescriptionId(@Context UriInfo uriInfo) {
	        return sendResponse(new UserWSO());
	    }
	    
}


