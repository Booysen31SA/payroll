package cput.ac.za.service;

public interface IService<NameOfRepo, ID> {

    NameOfRepo create(NameOfRepo name);
    NameOfRepo read(ID id);
    NameOfRepo update(NameOfRepo name);
    void delete(ID id);
}
