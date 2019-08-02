package cput.ac.za.repository;

public interface IRepository<NameOfRepo, ID>{

    NameOfRepo create(NameOfRepo name);
    NameOfRepo read(ID id);
    NameOfRepo update(NameOfRepo name);
    void delete(ID id);

}
