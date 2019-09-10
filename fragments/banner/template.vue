<template>
  <themecleanflex-components-block v-bind:model="model">
    <banner class="w-full">
      <div class="relative overflow-hidden">
        <img class="w-full h-full object-center" v-bind:src="model.image">
        <h2 class="absolute top-0 p-4 text-white text-xl w-full" v-html="model.title"></h2>
        <p class="absolute bottom-0 p-4 text-white text-xl w-full" v-html="model.text"></p>
      </div>
    </banner>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

