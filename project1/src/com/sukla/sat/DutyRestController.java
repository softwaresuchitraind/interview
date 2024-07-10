package com.sukla.sat;

//localhost:8085/abc/concatName/abc?value=xyz

//@RestController("/abc")
@Controller
@RequestMapping("/abc")
public class DutyRestController
{

		//Pathparam/parh varivale
	
	@PostMapping("/concatName")
	@ApiOperation("Concating String")
	@PreAuthorize("ROLE")
	public ResponseEntity<?> concatString
			(@PathVariable String concatName,@Requestparam String value)throws GenericException
	{
		String s1 ="hello";
		String sb =s1.concat(value).concat(concatName);
		return ResponseEntity<>sb.toString();
	}
	
}
