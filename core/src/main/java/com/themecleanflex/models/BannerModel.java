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
    "Banner": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "image": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image",
          "x-form-type": "pathbrowser",
          "x-form-browserRoot": "/content/assets"
        },
        "title": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Title",
          "x-form-type": "text"
        },
        "text": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Text",
          "x-form-type": "texteditor"
        }
      }
    }
  },
  "name": "Banner",
  "componentPath": "themecleanflex/components/banner",
  "package": "com.themecleanflex.models",
  "modelName": "Banner",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/banner",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class BannerModel extends AbstractComponent {

    public BannerModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	@Inject
	private String image;

	/* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
	@Inject
	private String title;

	/* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
	@Inject
	private String text;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	public String getImage() {
		return image;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Title","x-form-type":"text"} */
	public String getTitle() {
		return title;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Text","x-form-type":"texteditor"} */
	public String getText() {
		return text;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
