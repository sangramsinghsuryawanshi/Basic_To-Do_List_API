package com.project.TDL.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.TDL.Model.ToDoListDatabase;
import com.project.TDL.Repo.ToDoListConn;

@Controller
public class ToDoListController 
{
	@Autowired
	private ToDoListConn TDLC;
	
	@RequestMapping("/")
	public String isLand()
	{
		return "AddList.jsp";
	}
	@RequestMapping("/add")
	public String isAdd(@ModelAttribute ToDoListDatabase TDLD, Model m)
	{
		ToDoListDatabase tdld = new ToDoListDatabase();
		tdld.setDiscription(TDLD.getDiscription());
		tdld.setStatus("Not Completed");
		if(TDLC!=null)
		{
			TDLC.save(tdld);
			m.addAttribute("msg", "ToDoList Added Successfully.!");
			return "/";
		}
		else
		{
			m.addAttribute("emsg", "ToDoList Not Added...");
			return "/";
		}
	}
	@RequestMapping("/VA")
	public String isVA(Model m)
	{
		List<ToDoListDatabase> lt = TDLC.findAll();
		m.addAttribute("dis", lt);
		return "ViewAll.jsp";
	}
	@RequestMapping("/del{id}")
	public String isDel(@PathVariable int id)
	{
		TDLC.deleteById(id);
		return "/VA";
	}
	@RequestMapping("/{id}")
	public String isUp(Model m,@ModelAttribute ToDoListDatabase tdlc,@PathVariable int id)
	{
		ToDoListDatabase td = TDLC.findById(id).orElse(null);
		td.setStatus("Completed");
		TDLC.save(td);
		m.addAttribute("msg", "ToDOList Updated Successfully..!");
		return "/VA";
	}
}
