module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.mapField($.find('p'), 'model.text')
        f.bindAttribute($.find('a').first(), 'href', 'model.url')
    }
}