package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

@Override
 public void run(String... args) throws Exception {


           if (outsourcedPartRepository.count() == 0) {



                  OutsourcedPart Network_Interface_Card   = new OutsourcedPart();
                  Network_Interface_Card.setCompanyName("MicroTech");
                  Network_Interface_Card.setName("Network Interface Card");
                  Network_Interface_Card.setInv(5);
                  Network_Interface_Card.setMaxInv(5);
                  Network_Interface_Card.setMinInv(2);
                  Network_Interface_Card.setPrice(25.0);
                  Network_Interface_Card.setId(100L);



                  OutsourcedPart Expansion_Card   = new OutsourcedPart();
                  Expansion_Card.setCompanyName("MicroTech");
                  Expansion_Card.setName("Expansion Card");
                  Expansion_Card.setInv(5);
                  Expansion_Card.setMaxInv(5);
                  Expansion_Card.setMinInv(2);
                  Expansion_Card.setPrice(20.0);
                  Expansion_Card.setId(101L);


                  OutsourcedPart Motherboard   = new OutsourcedPart();
                  Motherboard.setCompanyName("MicroTech");
                  Motherboard.setName("Motherboard");
                  Motherboard.setInv(5);
                  Motherboard.setMaxInv(5);
                  Motherboard.setMinInv(2);
                  Motherboard.setPrice(30.0);
                  Motherboard.setId(103L);


                  OutsourcedPart Heat_Sink   = new OutsourcedPart();
                  Heat_Sink.setCompanyName("MicroTech");
                  Heat_Sink.setName("Heat Sink");
                  Heat_Sink.setInv(5);
                  Heat_Sink.setMaxInv(5);
                  Heat_Sink.setMinInv(2);
                  Heat_Sink.setPrice(17.0);
                  Heat_Sink.setId(104L);


                  OutsourcedPart SATA_Cable   = new OutsourcedPart();
                  SATA_Cable.setCompanyName("MicroTech");
                  SATA_Cable.setName("SATA Cable");
                  SATA_Cable.setInv(5);
                  SATA_Cable.setMaxInv(5);
                  SATA_Cable.setMinInv(2);
                  SATA_Cable.setPrice(10.0);
                  SATA_Cable.setId(105L);

                  outsourcedPartRepository.save(Network_Interface_Card);
                  outsourcedPartRepository.save(Expansion_Card);
                  outsourcedPartRepository.save(Motherboard);
                  outsourcedPartRepository.save(Heat_Sink);
                  outsourcedPartRepository.save(SATA_Cable);
           }
        /*
        outsourcedPartRepository.save(o);

        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
        */
       if (productRepository.count() == 0) {

              Product Monitor= new Product("Monitor",120.0,5);
              Product Mouse= new Product("Mouse",80.0,5);
              Product Gpu= new Product("Graphic card",160.0,5);
              Product Cpu= new Product("Computer processing unit",180.0,5);
              Product Power_supply= new Product("Powersupply",100.0,5);
              productRepository.save(Monitor);
              productRepository.save(Mouse);
              productRepository.save(Gpu);
              productRepository.save(Cpu);
              productRepository.save(Power_supply);


              System.out.println("Started in Bootstrap");
              System.out.println("Number of Products"+productRepository.count());
              System.out.println(productRepository.findAll());
              System.out.println("Number of Parts"+partRepository.count());
              System.out.println(partRepository.findAll());

       }
}
}
