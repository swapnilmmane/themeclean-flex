<template>
  <div v-bind:data-per-path="model.path">
    <div v-for="(item,i) in model.links" :key="i">

    <div v-if="item.internallink.length > 0">
     <a v-bind:href="item.internallink"><h2 v-html="item.title"></h2></a>
    </div>
    <div v-else>
    <a v-bind:href="item.externalurl"><h2 v-html="item.title"></h2></a>
    </div>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

