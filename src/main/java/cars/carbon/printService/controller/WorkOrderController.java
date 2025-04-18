package cars.carbon.printService.controller;

import cars.carbon.printService.model.WorkOrder;
import cars.carbon.printService.service.WorkOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/create")
public class WorkOrderController {

    private final WorkOrderService workOrderService;

    public WorkOrderController(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    @GetMapping
    public List<WorkOrder> getAll(){
        return workOrderService.getAll();
    }

    @PostMapping
    public WorkOrder create(@RequestBody WorkOrder workOrder){
        return workOrderService.save(workOrder);
    }

}
