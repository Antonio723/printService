package cars.carbon.printService.service;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportService {
    public byte[] gerarEtiqueta(String codigoEtiqueta) throws JRException {
        // Carrega o arquivo .jrxml do classpath
        InputStream jasperStream = this.getClass().getResourceAsStream("/Reports/BR_PROCUTION_LABEL.jrxml");
        if (jasperStream == null) {
            throw new JRException("Arquivo .jrxml não encontrado no classpath.");
        }
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperStream);

        // Preenche o relatório
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("codigoEtiqueta", codigoEtiqueta);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, new JREmptyDataSource());

        // Exporta para PDF (em bytes)
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }
}
