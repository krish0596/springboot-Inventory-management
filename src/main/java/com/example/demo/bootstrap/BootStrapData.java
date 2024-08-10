package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        if (outsourcedPartRepository.count() == 0 && partRepository.count() == 0 && productRepository.count() == 0) {
            InhousePart computerCase = new InhousePart();
            computerCase.setName("Computer Case");
            computerCase.setPrice(99.99);
            computerCase.setInv(11);
            computerCase.setPartId(1);
            computerCase.setMin(1);
            computerCase.setMax(100);
            partRepository.save(computerCase);

            OutsourcedPart graphicsCard = new OutsourcedPart();
            graphicsCard.setCompanyName("NVIDIA");
            graphicsCard.setName("GeForce RTX 4090");
            graphicsCard.setInv(6);
            graphicsCard.setPrice(1999.99);
            graphicsCard.setMin(1);
            graphicsCard.setMax(100);
            outsourcedPartRepository.save(graphicsCard);

            OutsourcedPart CPU = new OutsourcedPart();
            CPU.setCompanyName("Intel");
            CPU.setName("i9-14900K CPU");
            CPU.setInv(12);
            CPU.setPrice(549.99);
            CPU.setMin(1);
            CPU.setMax(100);
            outsourcedPartRepository.save(CPU);

            OutsourcedPart motherboard = new OutsourcedPart();
            motherboard.setCompanyName("GIGABYTE");
            motherboard.setName("Z790 AORUS PRO X Motherboard");
            motherboard.setInv(35);
            motherboard.setPrice(389.99);
            motherboard.setMin(1);
            motherboard.setMax(100);
            outsourcedPartRepository.save(motherboard);

            OutsourcedPart RAM = new OutsourcedPart();
            RAM.setCompanyName("Crucial");
            RAM.setName("2x16 DDR5 6000Mhz RAM");
            RAM.setInv(12);
            RAM.setPrice(104.99);
            RAM.setMin(1);
            RAM.setMax(100);
            outsourcedPartRepository.save(RAM);

            OutsourcedPart SSD = new OutsourcedPart();
            SSD.setCompanyName("Samsung");
            SSD.setName("990 EVO SSD 1TB");
            SSD.setInv(6);
            SSD.setPrice(89.99);
            SSD.setMin(1);
            SSD.setMax(100);
            outsourcedPartRepository.save(SSD);

            Product product1= new Product("Case + SSD", 224.99, 2);
            productRepository.save(product1);

            Product product2= new Product("Motherboard + CPU", 999.99, 5);
            productRepository.save(product2);

            Product product3= new Product("CPU + RAM", 659.99, 2);
            productRepository.save(product3);

            Product product4= new Product("Motherboard + CPU + RAM", 1049.99, 4);
            productRepository.save(product4);

            Product product5= new Product("Full PC", 2499.99, 1);
            productRepository.save(product5);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+ " " + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+ " " + partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
