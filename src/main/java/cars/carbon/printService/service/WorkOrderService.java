package cars.carbon.printService.service;

import cars.carbon.printService.model.WorkOrder;
import cars.carbon.printService.repository.WorkOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkOrderService {
    private final WorkOrderRepository workOrderRepository;

    public WorkOrderService(WorkOrderRepository workOrderRepository) {
        this.workOrderRepository = workOrderRepository;
    }

    public List<WorkOrder> getAll(){
        return workOrderRepository.findAll();
    }

    public WorkOrder save(WorkOrder workOrder){
        return workOrderRepository.save(workOrder);
    }

    public void delete(Long id){
        workOrderRepository.deleteById(id);
    }
}
