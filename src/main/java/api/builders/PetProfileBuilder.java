package api.builders;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import utils.enums.PetStatus;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class PetProfileBuilder {

    int id;
    PetCategoryBuilder category;
    String name;
    List<String> photoUrls;
    List<PetTagsBuilder> tags;
    PetStatus status;
}
