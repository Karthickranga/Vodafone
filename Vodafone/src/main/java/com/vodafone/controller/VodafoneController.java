package com.vodafone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.dto.VodafoneDto;
import com.vodafone.service.VodafoneService;

@RestController
@RequestMapping("/vodafone_data")
public class VodafoneController {
	@Autowired
	private VodafoneService vodafoneService;
	
	@PostMapping("/vodafone_add")
	public String addVodafoneDetails(@RequestBody VodafoneDto vodafoneDto)
	{
		return vodafoneService.addVodafoneData(vodafoneDto);
	}
	@GetMapping("/vodafone_getid")
	public VodafoneDto getById(@RequestParam Integer empId)
	{
		return vodafoneService.getByvodafoneId(empId);
	}
	@GetMapping("/vodafone_getall")
	public List<VodafoneDto> getall()
	{
		return vodafoneService.getAllVodafoneDetails();
	}
	@DeleteMapping("vodafone_deletebyId")
	public String deletebyId(@RequestParam Integer empId)
	{
		return vodafoneService.deletebyId(empId);
	}
	@PutMapping("/vodafone_updatebyId")
	public String updateDetails(@RequestBody VodafoneDto vodafoneDto)
	{
        return vodafoneService.updateByDetails(vodafoneDto);
		}
	
	
	
}
