package cars.carbon.printService.controller;
import cars.carbon.printService.service.ReportService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
    private final ReportService etiquetaService;

    public ReportController(ReportService etiquetaService) {
        this.etiquetaService = etiquetaService;
    }

    @GetMapping("/etiqueta")
    public void gerarEtiqueta(@RequestParam String codigo, HttpServletResponse response) throws Exception {
        byte[] pdf = etiquetaService.gerarEtiqueta(codigo);

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=etiqueta.pdf");
        response.getOutputStream().write(pdf);
    }
}
