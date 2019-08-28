package com.themecleanflex.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import com.peregrine.nodetypes.models.Container;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Calltoaction": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "text": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Text",
          "x-form-type": "text"
        },
        "url": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "URL",
          "x-form-type": "url"
        }
      }
    }
  },
  "name": "Calltoaction",
  "componentPath": "themecleanflex/components/calltoaction",
  "package": "com.themecleanflex.models",
  "modelName": "Calltoaction",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/calltoaction",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class CalltoactionModel extends AbstractComponent {

    public CalltoactionModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"text"} */
	@Inject
	private String text;

	/* {"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"url"} */
	@Inject
	private String url;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"text"} */
	public String getText() {
		return text;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"URL","x-form-type":"url"} */
	public String getUrl() {
		return url;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
