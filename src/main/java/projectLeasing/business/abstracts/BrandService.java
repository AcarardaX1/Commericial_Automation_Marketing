package projectLeasing.business.abstracts;

import projectLeasing.business.request.CreateBrandRequest;
import projectLeasing.business.response.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {



    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);


}
