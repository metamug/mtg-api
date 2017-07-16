import com.metamug.exec;

/**
* Request Filter for pre-processing the incoming request
* @param Request incoming request
* @return filtered/altered request
*/
public interface RequestFilterable {
    public Request filter(Request request);
}
