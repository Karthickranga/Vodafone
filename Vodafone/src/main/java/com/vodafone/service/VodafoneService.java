 package com.vodafone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.dto.VodafoneDto;
import com.vodafone.model.VodafoneModel;
import com.vodafone.repo.VodafoneRepo;
@Service
public class VodafoneService {
	@Autowired
	private VodafoneRepo vodafoneRepo;

	public String addVodafoneData(VodafoneDto vodafoneDto) {
		String message="";
		if(vodafoneDto !=null)
		{
		VodafoneModel vodafoneModel=new VodafoneModel();
		vodafoneModel.setEmpName(vodafoneDto.getEmpName());
		vodafoneModel.setEmpCity(vodafoneDto.getEmpCity());
		vodafoneModel.setEmpPhoneNo(vodafoneDto.getEmpPhoneNo());
		VodafoneModel save = vodafoneRepo.save(vodafoneModel);
		message="vodafone data added successfully";
		}
		else
		{
			message="vodafone data not added";
		}
	    return message;
	    }
	public VodafoneDto getByvodafoneId(Integer empId )
	{
		VodafoneDto vodafoneDto=new VodafoneDto();
		VodafoneModel byId = vodafoneRepo.getReferenceById(empId);
		vodafoneDto.setEmpId(byId.getEmpId());
		vodafoneDto.setEmpName(byId.getEmpName());
		vodafoneDto.setEmpCity(byId.getEmpCity());
		vodafoneDto.setEmpPhoneNo(byId.getEmpPhoneNo());
	   
		return vodafoneDto;
		}
	public List<VodafoneDto> getAllVodafoneDetails()
	{
		List<VodafoneDto> vodafonedto=new ArrayList<>();
		VodafoneDto vodafoneDto=new VodafoneDto();
		List<VodafoneModel> findAlldata = vodafoneRepo.findAll();
		for (VodafoneModel vodafonemode : findAlldata) {
			vodafoneDto=new VodafoneDto();
			vodafoneDto.setEmpId(vodafonemode.getEmpId());
			vodafoneDto.setEmpName(vodafonemode.getEmpName());
			vodafoneDto.setEmpCity(vodafonemode.getEmpCity());
			vodafoneDto.setEmpPhoneNo(vodafonemode.getEmpPhoneNo());
			vodafonedto.add(vodafoneDto);
			}
		
		return vodafonedto;
	}
	public String deletebyId(Integer empId)
	{
		String message="";
		if(empId !=null)
		{
		vodafoneRepo.deleteById(empId);
        message="vodafone data deleted successfully";
		}
		else
		{
			message="vodafone data not deleted successfully";
		}
		
		
		return message;
	}
	public String updateByDetails(VodafoneDto vodafoneDto)
	{
		String message="";
		VodafoneModel Id = vodafoneRepo.findByempId(vodafoneDto.getEmpId());
		if(Id!=null)
		{
		
		Id.setEmpName(vodafoneDto.getEmpName());
		Id.setEmpCity(vodafoneDto.getEmpCity());
		message="vodafone data updated successfully";
		
		}
		return message;
		}
}
