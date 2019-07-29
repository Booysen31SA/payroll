package cput.ac.za.repository;

public interface IRepostitory <NameOfRepo, ID>{

    NameOfRepo create(NameOfRepo name );
    NameOfRepo read(ID id);
    NameOfRepo update(NameOfRepo name);
    void delete(ID id);

}
