package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteDeOrdenacao {

	public static void main(String[] args) {
		List<ProgramaDTO> programas = new ArrayList<ProgramaDTO>();
		
		ProgramaDTO dto1 = new ProgramaDTO();
		dto1.setCodigo(1);
		dto1.setNome("Lindsay");
		programas.add(dto1);
		ProgramaDTO dto2 = new ProgramaDTO();
		dto2.setCodigo(2);
		dto2.setNome("Betsy");
		programas.add(dto2);
		ProgramaDTO dto3 = new ProgramaDTO();
		dto3.setCodigo(3);
		dto3.setNome("Agatha");
		programas.add(dto3);
		
		System.out.println("Sem ordenação:");
		for (ProgramaDTO dto : programas) {
			System.out.println("lista antiga: "+dto.getNome());
		}
		
		Collections.sort(programas, new ProgramaDTO());
		
		System.out.println("Com ordenação:");
		for (ProgramaDTO dto : programas) {
			System.out.println("lista organizada:" + dto.getNome());
		}
	}
}
