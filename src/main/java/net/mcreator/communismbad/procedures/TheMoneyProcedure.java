package net.mcreator.communismbad.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class TheMoneyProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack itemInHand = ItemStack.EMPTY;
		ItemStack oldBlock = ItemStack.EMPTY;
		itemInHand = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (EnchantmentHelper.getItemEnchantmentLevel(CommunismbadModEnchantments.BIG_MONEY, (itemInHand)) > 0) {
			if ((itemInHand).getItem().isCorrectToolForDrops((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) == true) {
				oldBlock = (new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()));
				for (int index0 = 0; index0 < (int) (Math.pow(
						EnchantmentHelper.getItemEnchantmentLevel(CommunismbadModEnchantments.BIG_MONEY, (itemInHand)),
						EnchantmentHelper.getItemEnchantmentLevel(CommunismbadModEnchantments.BIG_MONEY, (itemInHand)))); index0++) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = ((oldBlock).getItem()instanceof BlockItem _bi
								? _bi.getBlock().defaultBlockState()
								: Blocks.AIR.defaultBlockState());
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level) {
						Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
								new BlockPos((int) (x + 0.5), (int) (y + 0.5), (int) (z + 0.5)));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			}
		}
	}
}
