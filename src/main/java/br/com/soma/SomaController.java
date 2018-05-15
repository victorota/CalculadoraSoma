package br.com.soma;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomaController {
	
	@GetMapping("/{n1}/PLUS/{n2}")
	public int calculaSoma(@PathVariable int n1, @PathVariable int n2) {
		return n1 + n2;
	}
}
