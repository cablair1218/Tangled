package blair.carina.api;

import java.util.HashMap;
import java.util.Map;

/*
 * This class shows how to make a simple authenticated call to the
 * Amazon Product Advertising API.
 *
 * See the README.html that came with this sample for instructions on
 * configuring and running the sample.
 */
public class AmazonRequest{

    /*
     * Your AWS Access Key ID, as taken from the AWS Your Account page.
     */


    /*
     * Use the end-point according to the region you are interested in.
     */
    private final String ENDPOINT = "webservices.amazon.com";

    public String makeRequest(String search) {

        /*
         * Set up the signed requests helper.
         */
        SignedRequestsHelper helper;

        try {
            helper = SignedRequestsHelper.getInstance(ENDPOINT, AWS_ACCESS_KEY_ID, AWS_SECRET_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }

        String requestUrl = null;

        Map<String, String> params = new HashMap<String, String>();

        params.put("Service", "AWSECommerceService");
        params.put("Operation", "ItemSearch");
        params.put("AWSAccessKeyId", "AKIAIHWUGPE7AQ54YM3Q");
        params.put("AssociateTag", "121894-20");
        params.put("SearchIndex", "Beauty");
        params.put("Keywords", search);
        params.put("ResponseGroup", "BrowseNodes,Images,ItemAttributes,Offers");
        params.put("Sort", "price");
        params.put("BrowseNode", "11057241");
        params.put("MerchantId", "Amazon");

        requestUrl = helper.sign(params);

        return requestUrl;

    }
}
