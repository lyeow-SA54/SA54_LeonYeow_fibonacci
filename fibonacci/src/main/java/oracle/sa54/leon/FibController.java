package oracle.sa54.leon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class FibController {
	
	@GetMapping("/fibonacci")
	public HashMap<String, List<Long>> inputValue(@RequestParam String elements) throws JsonMappingException, JsonProcessingException
	{
		//to parse Json parameter in variables we can manipulate
		ObjectMapper objectMapper = new ObjectMapper();
		int inputElem = objectMapper.readValue(elements, int.class);
		
		//arraylist to contain fibonacci sequence output based on number of elements desired 
		List<Long> unsortedList = new ArrayList<Long>();
		for (int i = 0; i < inputElem; i++)
            unsortedList.add(Long.valueOf(FibCalc.fib(i)));
		
		//mapping of all output into format ready for transformation to Json
		HashMap<String, List<Long>> jsonOutput = new HashMap<String, List<Long>>(); 
		jsonOutput.put("fibonacci", unsortedList);
		
		//sorted values method output called directly while mapping
		jsonOutput.put("sorted", FibCalc.fibonacciReturnSorted(unsortedList));
		return jsonOutput;
	}
}
